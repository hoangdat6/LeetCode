/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool flipEquiv(TreeNode* root1, TreeNode* root2) {
        return flipEquivHelpper(root1, root2);
    }

    bool flipEquivHelpper(TreeNode* root1, TreeNode* root2) {
        if(!root1 && !root2) return true;
        if(!root1 || !root2 || root1->val != root2->val) return false;

        bool check1 = flipEquivHelpper(root1->left, root2->left);
        bool check2 = flipEquivHelpper(root1->left, root2->right);
        bool check3 = flipEquivHelpper(root1->right, root2->right);
        bool check4 = flipEquivHelpper(root1->right, root2->left);

        return (check1 || check2) && (check3 || check4);
    }
};