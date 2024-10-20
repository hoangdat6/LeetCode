class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int area = (right - left) * Math.min(height[left], height[right]);

        while(left < right){
            int min = Math.min(height[left], height[right]);
            while (left < right && height[left] <= min){
                ++left;
            }
            while(left < right && height[right] <= min) {
                --right;
            }
            area = Math.max(area, (right - left) * Math.min(height[left], height[right]));
        }

        return area;
    }
}