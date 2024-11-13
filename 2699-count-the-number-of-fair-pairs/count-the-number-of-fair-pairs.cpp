class Solution {
public:
 int c_upper(vector<int>& nums, int num, int index, int upper) {
        int l = index, r = nums.size() - 1;
        int mid;
        while(l <= r) {
            mid = l + (r - l) / 2;
            if(nums[mid] + num <= upper) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }

    int c_lower(vector<int>& nums, int num, int index, int lower) {
        int l = index, r = nums.size() - 1;
        int mid;
        while(l <= r) {
            mid = l + (r - l) / 2;
            if(nums[mid] + num >= lower) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    long long countFairPairs(vector<int>& nums, int lower, int upper) {
        sort(nums.begin(), nums.end());
        int n = nums.size();
        long long ans = 0;
        int u, l;
        for(int i = 0; i < n; ++i) {
            u = c_upper(nums, nums[i], i + 1, upper);
            l = c_lower(nums, nums[i], i + 1, lower);

            ans += max(0, u - l + 1);
        }

        return ans;
    }
};