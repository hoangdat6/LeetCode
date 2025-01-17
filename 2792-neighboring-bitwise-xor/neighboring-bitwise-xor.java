class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sum = 0;
        for(int b : derived) {
            sum += b;
        }

        return sum % 2 == 0;
    }
}