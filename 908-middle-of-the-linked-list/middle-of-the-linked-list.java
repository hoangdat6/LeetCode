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
        int i = 0;
        while(head != null){
            cnt++;
            if(cnt / 2 > i){
                ++i;
                tmp = tmp.next;
            }
            
            head = head.next;
        }
        
        return tmp;
    }
}