class Solution {
public:
    long long minimumSteps(string s) {
        long long n = s.size();
        long long ans = 0;

        long long cnt0 = 0;
        for(long long i = n - 1; i >= 0; --i) {
            if(s[i] == '0') {
                cnt0 ++;
            }else {
                ans += cnt0;   
            }
        }

        return ans;
    }
};