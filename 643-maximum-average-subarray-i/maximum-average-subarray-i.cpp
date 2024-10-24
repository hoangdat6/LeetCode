class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        if(nums.size() == 1) return nums[0];
        double sum = 0;

        for(int i = 0; i < k; ++i) {
            sum += nums[i];
        }

        double maxv = sum;

        for(int i = k; i < nums.size(); ++i) {
            sum += nums[i] - nums[i - k];
            maxv = max(maxv, sum);
        }

        return maxv / k;
    }
};