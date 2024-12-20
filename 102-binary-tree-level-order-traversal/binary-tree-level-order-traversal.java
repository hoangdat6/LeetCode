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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList();
        List<List<Integer>> ans = new ArrayList<>();

        bfs(root, ans, 0);
        return ans;
    }

    private void bfs(TreeNode root, List<List<Integer>> ans, int level) {
        if(root == null) return;

        if(ans.size() < level + 1) {
            ans.add(new ArrayList());
        }

        ans.get(level).add(root.val);
        bfs(root.left, ans, level + 1);
        bfs(root.right, ans, level + 1);
    }
}