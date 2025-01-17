class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int prev = 0;
        for(int b : derived) {
            prev ^= b;
        }

        return prev == 0;
    }
}