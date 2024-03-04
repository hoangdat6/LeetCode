class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int score = 0;
        int right = n - 1;
        for(int i = 0; i <= right;){
            if(power >= tokens[i]){
                score++;
                power -= tokens[i];
                ++i;
            }else if(i < right && score > 0){
                score--;
                power += tokens[right];
                right--;
            }else {
                return score;
            }
        }

        return score;
    }
}