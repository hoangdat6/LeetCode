class Solution {
public:
    int maxMoves(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        vector<vector<int>> dp(n, vector<int>(m, 0));

        for(int i = 0; i < n; ++i) {
            dp[i][0] = 1;
        }

        int ans = 0;
        for(int i = 1; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                for(int k = j - 1; k <= j + 1; ++k) {
                    if(k >= 0 && k < n && grid[j][i] > grid[k][i - 1] && dp[k][i - 1] > 0) {
                        dp[j][i] = max(dp[j][i], 1 + dp[k][i - 1]);
                    }
                }
                ans = max(ans, dp[j][i] - 1);
            }
        }

        return ans;
    }
};