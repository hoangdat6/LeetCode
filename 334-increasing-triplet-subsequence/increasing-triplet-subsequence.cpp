class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        vector<long> v(3, 2147483648);

        for(int i = 0; i < nums.size(); ++i) {
            if(nums[i] <= v[0]) {
                v[0] = nums[i];
            }else {
                if(nums[i] <= v[1]) {
                    v[1] = nums[i];
                }else {
                    if(nums[i] <= v[2]) {
                        v[2] = nums[i];
                    }
                }
            }
        } 
    

        return !(v[2] == 2147483648);
    }
};