class Solution {
    public int minimumLength(String s) {
        int re = s.length();
        int left = 0;
        int right = re - 1;
        char prev = 'd';

        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                prev = s.charAt(left);
                left++;
                right--;
                re -= 2;
            }
            while(s.charAt(left) == prev && right >= left){
                re--;
                left ++;
            }

            while(s.charAt(right) == prev && right >= left){
                re--;
                right--;
            }

            if(s.charAt(left) != s.charAt(right)) break;
        }

        return re < 0 ? 0 : re;
    }
}