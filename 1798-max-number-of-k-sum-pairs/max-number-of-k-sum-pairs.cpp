class Solution {
public:
    int maxOperations(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        int ans = 0;
        int l = 0, r = nums.size() - 1;
        while(l < r) {
            int e = k - nums[l];
            if(e == nums[r]) {
                ans ++;
                l++; r--;
            }else if(e < nums[r]) {
                r--;
            }else {
                l ++;
            }
        }

        return ans;
    }
};