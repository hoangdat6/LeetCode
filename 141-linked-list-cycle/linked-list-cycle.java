/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode f = head;
        while(f != null && f.next != null){
            head = head.next;
            f = f.next.next;

            if(head == f) return true;
        }

        return false;
    }
}