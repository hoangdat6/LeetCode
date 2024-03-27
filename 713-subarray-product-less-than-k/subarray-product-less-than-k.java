class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int re = 0;
        for(int i = 0; i < nums.length - 1; ++i){
            if(nums[i] < k) {
                re ++;
                int mul = nums[i];
                int j = i + 1;
                while(j < nums.length){
                    mul *= nums[j];
                    if(mul < k) re++;
                    else break;
                    j++;
                }
            }
            
        }
        if(nums[nums.length - 1] < k) re++;
        return re;
    }
}