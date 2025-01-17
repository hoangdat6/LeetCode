class Solution {
    public boolean doesValidArrayExist(int[] derived) {

        int prev = 0;
        for(int b : derived) {
            prev ^= b;
        }

        if(prev == 0) return true;

        prev = 1;
        for(int b : derived) {
            prev ^= b;
        }

        if(prev == 1) return true;

        return false;
    }
}