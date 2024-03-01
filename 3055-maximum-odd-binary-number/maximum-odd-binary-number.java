class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cnt1 = 0;
        int cnt0 = 0;

        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == '1'){
                cnt1 ++;
            }else {
                cnt0 ++;
            }
        }

        String re = "";

        while(cnt1 > 1){
            re += '1';
            cnt1 --;
        }

        while(cnt0 > 0){
            re += '0';
            cnt0--;
        }

        re += '1';

        return re;
    }
}