class Solution {
    public int lengthOfLastWord(String s) {
        int re = 0;
        boolean check = true;
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == ' '){
                if(check){
                    check = false;
                }
            }else {
                if(!check){
                    re = 0;
                }
                ++re;
                check = true;
            }
        }
        return re;
    }
}