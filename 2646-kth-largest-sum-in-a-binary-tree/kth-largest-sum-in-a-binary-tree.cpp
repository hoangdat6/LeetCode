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
    long long kthLargestLevelSum(TreeNode* root, int k) {
        queue<pair<TreeNode*, int>> q;
        q.push({root, 0});
        vector<long long> v;

        while(!q.empty()) {
            pair<TreeNode*, int> tmp = q.front();
            q.pop();
            
            TreeNode* curr = tmp.first;
            int height = tmp.second;
            int val = curr->val;

            if(v.size() == height) {
                v.push_back(val);
            }else {
                v[height] += val;
            }

            if(curr->left != NULL) {
                q.push({curr->left, height + 1});
            }

            if(curr->right != NULL) {
                q.push({curr->right, height + 1});
            }
        }

        sort(v.begin(), v.end());

        if(v.size() < k) return -1;

        return v[v.size() - k];
    }
};