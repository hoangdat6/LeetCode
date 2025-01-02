class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int m = queries.length;
        int[] presum =  new int[n + 1];
        int[] ans =  new int[m];


        if(isStartEndVowel(words[0])) presum[0] = 1;

        for(int i = 1; i < n; ++i) {
            if(isStartEndVowel(words[i])) {
                presum[i] = presum[i - 1] + 1;
            }else {
                presum[i] = presum[i - 1];
            }
        }


        for(int i = 0; i < m; ++i) {
            int start = queries[i][0];
            int end = queries[i][1];
            
            ans[i] = presum[end];
            if(start - 1 >= 0) 
                ans[i] -= presum[start - 1];
        }
        return ans;
    }

    private boolean isStartEndVowel(String s){
        char start = s.charAt(0);
        char end = s.charAt(s.length() - 1);
        return (start == 'a' ||  start == 'e' || start == 'i' || start == 'o' || start == 'u')
            && (end == 'a' || end == 'e' || end == 'i' ||  end == 'o' || end == 'u');
    }
}