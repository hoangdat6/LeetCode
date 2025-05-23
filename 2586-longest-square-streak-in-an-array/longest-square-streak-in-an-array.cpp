auto init = []() { 
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(0);
    return 0;
} ();

class Solution {
public:
    int longestSquareStreak(vector<int>& nums) {
        unordered_map<long, int> streak;
        sort(nums.begin(), nums.end());
        
        int ans = 0;
        
        for(int i = 0; i < nums.size(); ++i) {
            long sq = (long)nums[i] * nums[i];
            if (streak.find(nums[i]) != streak.end()) {
                streak[sq] = streak[nums[i]] + 1;
            } else {
                streak[sq] = 1;
            }
            ans = max(ans, streak[sq]);
        }
        
        return ans == 1 ? -1 : ans;
    }
};
