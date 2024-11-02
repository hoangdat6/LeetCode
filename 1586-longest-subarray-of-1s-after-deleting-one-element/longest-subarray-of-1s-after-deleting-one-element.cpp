class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int cntZero = 0;
        int ans = 0;
        int left = 0;
        for(int right = 0; right < nums.size(); ++right) {
            if(nums[right] == 0) cntZero++;

            while(cntZero == 2) {
                if(nums[left++] == 0) cntZero--;
            }

            ans = max(right - left, ans);
        }

        return ans;
    }
};