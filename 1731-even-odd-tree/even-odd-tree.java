/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Queue<TreeNode> q = new LinkedList<>();
    public boolean isEvenOddTree(TreeNode root) {
        if(root.val % 2 == 0){
            return false;
        }

        
        q.offer(root);
        q.offer(null);
        int l = 1;
        int prev = 0;

        while(!q.isEmpty()){
            if(l % 2 == 0){
                prev = Integer.MAX_VALUE;
            }else {
                prev = Integer.MIN_VALUE;
            }

            while(q.peek() != null){
                if(q.peek().val % 2 != l % 2){
                    return false;
                }

                if(l % 2 == 0 && q.peek().val >= prev){
                    return false;
                }

                if(l % 2 != 0 && q.peek().val <= prev){
                    return false;
                }

                if(q.peek().left != null){
                    q.offer(q.peek().left);
                }

                if(q.peek().right != null){
                    q.offer(q.peek().right);
                }
                prev = q.poll().val;
            }
            q.poll();
            if(q.isEmpty()){
                break;
            }
            ++l;
            q.offer(null);
        }

        return true;
    }
}