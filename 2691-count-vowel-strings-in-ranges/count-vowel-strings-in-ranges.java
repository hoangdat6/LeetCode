class Solution {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] presum = new int[n + 1];

        for (int i = 0; i < n; ++i) {
            presum[i + 1] = presum[i] + (isStartEndVowel(words[i]) ? 1 : 0);
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            int start = queries[i][0];
            int end = queries[i][1];
            ans[i] = presum[end + 1] - presum[start];
        }
        return ans;
    }

    private boolean isStartEndVowel(String s) {
        return VOWELS.contains(s.charAt(0)) && VOWELS.contains(s.charAt(s.length() - 1));
    }
}
