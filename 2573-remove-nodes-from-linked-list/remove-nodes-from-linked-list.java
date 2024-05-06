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
    public ListNode removeNodes(ListNode head) {
        ListNode prevNode = head;
        ListNode currentNode = head.next;

        while(currentNode != null){
            ListNode nextNode = currentNode.next; 
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;

        ListNode tmp = head.next;
        ListNode max = head;
        while(tmp.next != null){
            if(max.val <= tmp.val) {
                max.next = tmp;
                max = tmp;
            }
            tmp = tmp.next;
        }

        if(max != tmp && tmp != null && tmp.val < max.val) {
            max.next = null;
        }

        prevNode = head;
        currentNode = head.next;

        while(currentNode != null){
            ListNode nextNode = currentNode.next; 
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;

        return head;
    }
}