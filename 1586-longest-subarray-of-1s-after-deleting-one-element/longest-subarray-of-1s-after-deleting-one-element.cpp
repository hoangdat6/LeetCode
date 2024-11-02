class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int cnt = 0;
        int n = nums.size();
        int ans = 0;
        int j = 0;
        for(int i = 0; i < n; ++i) {
            if(nums[i] == 0) cnt++;

            while(cnt == 2) {
                if(nums[j++] == 0) cnt--;
            }

            ans = max(i - j, ans);
        }

        return ans;
    }
};