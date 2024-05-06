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
        Stack<ListNode> st = new Stack<>();

        ListNode tmp = head;
        while(tmp != null) {
            st.push(tmp);
            tmp = tmp.next;
        }

        ListNode max = st.pop();                        
        System.out.println(max.val);

        while(!st.isEmpty()) {
            ListNode node = st.peek();
            if(max.val > node.val) {
                st.pop();
                ListNode n1;
                if(!st.isEmpty()){
                    n1 = st.peek();
                }else {
                    break;
                }
                n1.next = max;
                System.out.println(n1.val + " " + max.val);
                if(n1.val > max.val) max = n1;
            }else {
                max = st.pop();
            }
        }

        tmp = head;
        while(tmp != null){
            if(tmp == max){
                head = max;
                break;
            }
            tmp = tmp.next;
        }

        return head;
    }
}