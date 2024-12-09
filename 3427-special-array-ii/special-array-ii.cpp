class Solution {
public:
    vector<bool> isArraySpecial(vector<int>& nums, vector<vector<int>>& queries) {
        int n = nums.size();
        vector<int> a(n);
        a[0] = 0;
        vector<bool> ans(queries.size());

        for(int i = 1; i < n; ++i) {
            a[i] = a[i - 1];
            if(nums[i] % 2 == nums[i - 1] % 2) a[i] ++;
        }

        for(int i = 0; i < queries.size(); ++i) {
            ans[i] = (a[queries[i][1]] - a[queries[i][0]]) == 0;
        }

        return ans;
    }
};