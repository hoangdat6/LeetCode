class Solution {
    public char findKthBit(int n, int k) {
        if(n == 1 && k == 1) return '0'; 
        StringBuilder sb = new StringBuilder("0");

        String s = getStringAtIndex(n, 2, sb);

        return s.charAt(k - 1);
    }

    private String getStringAtIndex(int n, int index, StringBuilder sb) {
        char[] cs = sb.toString().toCharArray();

        for(int i = 0; i < cs.length; ++i) {
            if(cs[i] == '1') {
                cs[i] = '0';
            }else {
                cs[i] = '1';
            }
        }

        for(int i = 0; i < cs.length / 2; i++) {
            char tmp = cs[i];
            cs[i] = cs[cs.length - i - 1];
            cs[cs.length - i - 1] = tmp;
        }
        
        sb.append("1" + String.valueOf(cs));
        if(index == n) {
            return sb.toString();
        }
        return getStringAtIndex(n, index + 1, sb);
    }  
}