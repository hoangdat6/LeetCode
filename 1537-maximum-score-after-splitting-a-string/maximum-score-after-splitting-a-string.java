class Solution {
    public int maxScore(String s) {
        int n = s.length();

        int cnt1 = 0; 
        int cnt0 = 0;

        int ans = 0;
        for(int i = 0; i < n; ++i) {
            if(s.charAt(i) == '1') cnt1 ++;
        }

        for(int i = 0; i < n - 1; ++i) {
            if(s.charAt(i) == '0') {
                cnt0 ++;
            }else {
                cnt1 --;
            }

            ans = Math.max(ans, cnt0 + cnt1);
        }

        return ans;
    }
}