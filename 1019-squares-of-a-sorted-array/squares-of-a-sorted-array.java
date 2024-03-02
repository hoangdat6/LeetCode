class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] re = new int[n];

        int left = 0, right = n - 1;

        int i = n - 1;

        while(left <= right){
            int left_pow = nums[left] * nums[left];
            int right_pow = nums[right] * nums[right];
            if(left_pow > right_pow){
                re[i] = left_pow;
                left++;
            }else {
                re[i] = right_pow;
                right--;
            }
            --i;
        }

        return re;
    }
}