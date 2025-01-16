class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int num1 = 0;
        int num2 = 0;

        for(int num : nums1) {
            num1 ^= num;
        }

        for(int num : nums2) {
            num2 ^= num;
        }

        return (nums2.length % 2 == 1 ? num1 : 0) ^ (nums1.length % 2 == 1 ? num2 : 0);
    }
}