class Solution {
    public String customSortString(String order, String s) {
        int[] ch = new int[26];

        for(char c : s.toCharArray()){
            ch[c - 'a']++;
        }
        String re = "";
        for(char c : order.toCharArray()){
            while(ch[c - 'a'] != 0){
                re += c;
                ch[c - 'a']--;
            }
        }

        for(int i = 0; i < 26; i++){
            while(ch[i] != 0){
                re += (char)('a' + i);
                ch[i]--;
            }
        }

        return re;
    }
}