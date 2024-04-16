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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth <= 1){
            TreeNode re = new TreeNode(val, root, null);
            return re;
        }else {
            add(root, val, depth, 1);
            return root;
        }
    }

    void add(TreeNode root, int val, int depth, int cnt){
        if(cnt == depth - 1 && root != null){
            TreeNode left = root.left;
            TreeNode right = root.right;

            root.left = new TreeNode(val, left, null);
            root.right = new TreeNode(val, null, right);
            return;
        }else if(cnt != depth - 1 && root != null) {
            ++cnt;
            add(root.left, val, depth, cnt);
            add(root.right, val, depth, cnt);
        }
    }
}