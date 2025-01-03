class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n);

        ans[0] = 1;

        for(int i = 1; i < n; ++i) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for(int i = n - 2; i >= -1; --i) {
            ans[i + 1] *= suffix;
            suffix *= nums[i + 1];
        }


        return ans;
    }
};