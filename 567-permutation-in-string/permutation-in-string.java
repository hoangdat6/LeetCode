class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        for (char c : s1.toCharArray()) {
            s1Map[c - 'a']++;
        }

        int len1 = s1.length();
        int len2 = s2.length();

        for(int i = 0; i < len2; ++i) {
            s2Map[s2.charAt(i) - 'a'] ++;

            if(i >= len1) {
                s2Map[s2.charAt(i - len1) - 'a'] --;
            }

            if(matchs(s1Map, s2Map)) {
                return true;
            }
        }

        return false;
    }

    private boolean matchs(int[] s1Map, int[] s2Map) {
        for(int i = 0; i < 26; ++i) {
            if(s1Map[i] != s2Map[i])
                return false;
        }

        return true;
    }

}
