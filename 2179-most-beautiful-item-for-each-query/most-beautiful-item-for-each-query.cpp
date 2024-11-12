class Solution {
public:
    vector<int> maximumBeauty(vector<vector<int>>& items, vector<int>& queries) {
        int n = queries.size();
        vector<int> ans(n);

        sort(items.begin(), items.end(), [](vector<int> a, vector<int> b) {
            return a[0] < b[0];
        });

        for (int i = 1; i < items.size(); ++i) {
            items[i][1] = max(items[i - 1][1], items[i][1]);
        }

        int m = items.size();
        for (int i = 0; i < n; ++i) {
            int left = 0, right = m - 1;
            int maxBeauty = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (items[mid][0] <= queries[i]) {
                    maxBeauty = items[mid][1]; 
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            ans[i] = maxBeauty;
        }

        return ans;
    }
};
