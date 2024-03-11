class Solution {
    public String customSortString(String order, String s) {
        int[] ch = new int[26];

        for(char c : s.toCharArray()){
            ch[c - 'a']++;
        }
        StringBuilder re = new StringBuilder();
        for(char c : order.toCharArray()){
            while(ch[c - 'a'] != 0){
                re.append(c);
                ch[c - 'a']--;
            }
        }

        for(int i = 0; i < 26; i++){
            while(ch[i] != 0){
                re.append((char)('a' + i));
                ch[i]--;
            }
        }

        return re.toString();
    }
}