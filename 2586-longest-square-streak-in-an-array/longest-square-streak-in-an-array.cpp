auto init = []() { 
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(0);
    return 0;
} ();
class Solution {
public:
    int longestSquareStreak(vector<int>& nums) {
        map<long long, int> streak;
        sort(nums.begin(), nums.end());
        
        int ans = 0;
        
        for(int i = 0; i < nums.size(); ++i) {
            long long sq = (long long)nums[i] * nums[i];
            streak[sq] = streak[(long long)nums[i]] + 1;
            ans = max(ans, streak[sq]);
        }
        
        return ans == 1 ? -1 : ans;
    }
};