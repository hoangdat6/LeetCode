class Solution {
public:
    int waysToSplitArray(vector<int>& nums) {
        int n = nums.size();
        long rightsum = 0, leftsum = 0;

        for(int i = 0; i < n; ++i) {
            rightsum += nums[i];
        }

        int ans = 0;
        for(int i = 0; i < n - 1; ++i) {
            leftsum += nums[i];
            rightsum -= nums[i];

            if(leftsum >= rightsum) ans++;
        }

        return ans;
    }
};