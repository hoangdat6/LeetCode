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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = head;
        ListNode left = null;

        int l = 0;
        while(tmp != null){
            l++;
            tmp = tmp.next;
        }

        tmp = head;
        int pos = l - n;

        if(pos == 0) return head.next;

        for(int i = 0; i < pos; ++i){
            left = tmp;
            tmp = tmp.next;
        }

        left.next = tmp.next;

        tmp = null;
        
        return head;
    }
}