class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int left = 0;
        int right = tokens.length - 1;
        while(left <= right){
            if(power >= tokens[left]){
                ++score;
                power -= tokens[left];
                ++left;
            }else if(left < right && score > 0){
                --score;
                power += tokens[right];
                --right;
            }else {
                return score;
            }
        }

        return score;
    }
}