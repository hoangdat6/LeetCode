class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;

        for(String s : words) {
            byte check = 1;

            for(int j = 0; j < pref.length(); ++j) {
                if(s.length() < pref.length() || s.charAt(j) != pref.charAt(j)) {
                    check = 0;
                    break;
                }
            }

            ans += check;
        }

        return ans;
    }
}