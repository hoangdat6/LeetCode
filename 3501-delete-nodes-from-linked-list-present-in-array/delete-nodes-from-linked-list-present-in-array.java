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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int[] map = new int[100005];
        
        for(int num : nums) {
            map[num] = 1;
        }
        
        ListNode tmp = head, prev = null;
    
        
        while(tmp != null) {
            if(map[tmp.val] == 1) {
                if(prev == null) {
                    head = tmp.next;
                }else {
                    prev.next = tmp.next;
                }
            }else {
                prev = tmp;
            }
            tmp = tmp.next;

        }
        return head;
    }
}