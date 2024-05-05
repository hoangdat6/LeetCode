 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode tmp = null;
        while(node.next != null){
            node.val = node.next.val;
            tmp = node;
            node = node.next;
        }
        tmp.next = null;
    }
}