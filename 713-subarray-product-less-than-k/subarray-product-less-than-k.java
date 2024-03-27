class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n  = nums.length;
        int re = 0;
        for(int i = 0; i < n - 1; ++i){
            if(nums[i] < k) {
                re ++;
                int mul = nums[i];
                int j = i + 1;
                while(j < n){
                    mul *= nums[j];
                    if(mul < k) re++;
                    else break;
                    j++;
                }
            }
            
        }
        if(nums[n - 1] < k) re++;
        return re;
    }
}