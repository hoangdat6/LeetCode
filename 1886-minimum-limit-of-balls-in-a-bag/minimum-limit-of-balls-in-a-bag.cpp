class Solution {
public:
    int minimumSize(vector<int>& nums, int maxOperations) {
        int left = 1, right = 0;

        for(auto num : nums) {
            right = max(num, right);
        }

        while(left < right) {
            int mid = (left + right) / 2;

            if(check(nums, mid, maxOperations)) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }

        return left;
    }

    bool check(vector<int>& nums, int max, int maxOperations) {
        int ops = 0;
        for(auto num : nums) {
            int op = ceil(num / (double)max) - 1;
            ops += op;

            if(ops > maxOperations) return false;
        }

        return true;
    }
};