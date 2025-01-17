class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int prev = 1;
        for(int b : derived) {
            prev ^= b;
        }

        return prev == 1;
    }
}