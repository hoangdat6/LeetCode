class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);  // Sort the array
        int[] arr = new int[100001];  // Track streak length for each number
        int max = 0;

        for (int n : nums) {
            int root = (int) Math.sqrt(n);
            if (root * root != n) {
                arr[n] = 1;  // No predecessor, start new streak
            } else {
                arr[n] = arr[root] + 1;  // Extend streak from root
            }
            max = Math.max(max, arr[n]);  // Track maximum streak length
        }

        return max == 1 ? -1 : max;  // If no streaks longer than 1, return -1
    }
}