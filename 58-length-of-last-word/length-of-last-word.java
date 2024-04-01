class Solution {
    public int lengthOfLastWord(String s) {
        int re = 0;
        for(int i = s.length() - 1; i >= 0; --i){
            if(s.charAt(i) != ' ') re++;
            else if(re != 0) break;
        }
        return re;
    }
}