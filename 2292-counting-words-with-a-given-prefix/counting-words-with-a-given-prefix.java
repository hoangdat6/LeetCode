class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;

        for (String s : words) {
            if (s.length() >= pref.length()) {
                boolean isPrefix = true;
                for (int j = 0; j < pref.length(); j++) {
                    if (s.charAt(j) != pref.charAt(j)) {
                        isPrefix = false;
                        break;
                    }
                }
                if (isPrefix) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
