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
    public ListNode middleNode(ListNode head) {
        ListNode tmp = head;

        int cnt = 0;
        while(tmp != null){
            cnt ++;
            tmp = tmp.next;
        }
        int i = 0;
        while(i < cnt / 2){
            head = head.next;
            i++;
        }

        return head;
    }
}