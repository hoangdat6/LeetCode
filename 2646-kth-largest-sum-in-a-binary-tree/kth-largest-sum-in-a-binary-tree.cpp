class Solution {
public:
    long long kthLargestLevelSum(TreeNode* root, int k) {
        if (!root) return -1; // Trường hợp cây rỗng
        
        queue<TreeNode*> q;
        q.push(root);
        vector<long long> v;

        while(!q.empty()) {
            int size = q.size();
            long long levelSum = 0;

            for (int i = 0; i < size; ++i) {
                TreeNode* curr = q.front();
                q.pop();
                
                levelSum += curr->val;

                if (curr->left) q.push(curr->left);
                if (curr->right) q.push(curr->right);
            }

            v.push_back(levelSum);
        }

        if (v.size() < k) return -1;

        sort(v.begin(), v.end());

        return v[v.size() - k];
    }
};
