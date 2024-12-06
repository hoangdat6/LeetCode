class Solution {
public:
    int maxCount(vector<int>& banned, int n, int maxSum) {
        bool check[n + 1];

        for(int i = 1; i <= n; ++i) {
            check[i] = true;
        }

        for(int i = 0; i < banned.size(); ++i) {
            if(banned[i] <= n) {
                check[banned[i]] = false;
            }
        }

        int ans = 0;
        for(int i = 1; i < n + 1; ++i) {
            if(maxSum <= 0) break; 
            if(check[i] && maxSum - i >= 0) {
                ans ++;
                maxSum -= i;
            }
        }

        return ans;
    }
};