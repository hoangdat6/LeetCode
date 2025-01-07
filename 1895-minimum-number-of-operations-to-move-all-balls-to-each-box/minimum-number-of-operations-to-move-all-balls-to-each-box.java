class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];

        int one = boxes.charAt(0) == '1' ? 1 : 0;

        for(int i = 1; i < n; ++i) {
            ans[i] += one + ans[i - 1]; 
            if(boxes.charAt(i) == '1') {
                ++one; 
            }
        }
        
        one = 0;
        int prev = 0;
        for(int i = n - 1; i >= 0; --i) {
            ans[i] += prev;
            if(boxes.charAt(i) == '1') ++one; 
            prev += one;
        }

        return ans;
    }
}