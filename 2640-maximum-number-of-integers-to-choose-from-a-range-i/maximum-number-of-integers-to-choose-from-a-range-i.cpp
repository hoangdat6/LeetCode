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

        int sum = 0;
        int ans = 0;
        for(int i = 1; i < n + 1; ++i) {
            if(sum >= maxSum) break; 
            if(check[i] && ((sum + i) <= maxSum)) {
                ans ++;
                sum += i;
            }
        }

        return ans;
    }
};