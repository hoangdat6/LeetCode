class Solution {
public:
    int waysToSplitArray(vector<int>& nums) {
        int n = nums.size();
        long prevsum = 0;

        for(int i = 0; i < n; ++i) {
            prevsum += nums[i];
        }

        int ans = 0;
        long prevsumi = 0;
        for(int i = 0; i < n - 1; ++i) {
            prevsumi += nums[i];
            if(prevsumi >= prevsum - prevsumi) ans++;
        }

        return ans;
    }
};