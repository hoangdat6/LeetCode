class Solution {
    public long largestPerimeter(int[] nums) {
        long re = -1;
        Arrays.sort(nums);
        int n = nums.length;
        long sum = 0;
        for(int i = 0; i < n; ++i){
            if(i >= 2 && sum > nums[i]){
                re = sum + nums[i];
            }
            sum += nums[i];
        }

        return re;
    }
}