class Solution {
public:
    vector<bool> isArraySpecial(vector<int>& nums, vector<vector<int>>& queries) {
        int n = nums.size();
        vector<int> prefix(n);
        vector<bool> ans(queries.size());
        prefix[0] = 0;

        for(int i = 1; i < n; ++i) {
            prefix[i] = prefix[i - 1];
            if(nums[i] % 2 == nums[i - 1] % 2) prefix[i]++;
        }

        for(int i = 0; i < queries.size(); ++i) {
            ans[i] = (prefix[queries[i][1]] - prefix[queries[i][0]]) == 0;
        }

        return ans;
    }
};