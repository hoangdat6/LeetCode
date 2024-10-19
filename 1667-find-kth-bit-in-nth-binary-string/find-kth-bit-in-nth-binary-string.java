class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");

        for(int i = 2; i <= n; ++i) {
            sb.append("1" + reverseOfInvert(sb.toString()));
        }
        return sb.toString().charAt(k - 1);
    }

    private String reverseOfInvert(String s) {
        char[] cs = s.toCharArray();

        for(int i = 0; i < cs.length; ++i) {
            if(cs[i] == '1') {
                cs[i] = '0';
            }else {
                cs[i] = '1';
            }
        }

        for(int i = 0; i < cs.length / 2; i ++) {
            char tmp = cs[i];
            cs[i] = cs[cs.length - i - 1];
            cs[cs.length - i - 1] = tmp;
        }

        return String.valueOf(cs);
    }  
}