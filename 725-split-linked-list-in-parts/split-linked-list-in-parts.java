/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int nodeCnt = 0;
        
        ListNode tmp = head;

        while(tmp != null) {
            nodeCnt++;
            tmp = tmp.next;
        }

        int lenOfList = nodeCnt / k;
        int remain = nodeCnt % k;

        ListNode[] re = new ListNode[k];

        int index = 0;
        int len = 0;


        while(index < k) {
            len = lenOfList;
            if(remain > 0) {
                len += 1;
                remain--;
            }

            re[index] = head;
            while(len > 0) {
                tmp = head;
                head = head.next;
                len --;
            }


            if(tmp != null) {
                tmp.next = null;
            }

            index++;
        }

        return re;
    }
}