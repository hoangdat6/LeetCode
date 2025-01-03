class Solution {
public:
    int waysToSplitArray(vector<int>& nums) {
        int n = nums.size();
        long prev[n + 1];
        prev[0] = nums[0];

        for(int i = 1; i < n; ++i) {
            prev[i] = prev[i - 1] + nums[i];
        }

        int ans = 0;
        for(int i = 0; i < n - 1; ++i) {
            if(prev[i] >= prev[n - 1] - prev[i]) ans++;
        }

        return ans;
    }
};