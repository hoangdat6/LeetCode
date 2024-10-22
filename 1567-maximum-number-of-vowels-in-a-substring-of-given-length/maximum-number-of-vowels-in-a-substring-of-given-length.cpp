class Solution {
public:
    int maxVowels(string s, int k) {
        int cnt = 0;

        for(int i = 0; i < k; ++i) {
            if(isVowels(s[i])) {
                ++cnt;
            }
        } 

        int ans = cnt;

        for(int i = k; i < s.size(); ++i) {
            if(isVowels(s[i - k])) {
                cnt--;
            }

            if(isVowels(s[i])) {
                cnt++;
            }
            ans = max(ans, cnt);
        }
        return ans;
    }

    bool isVowels(char c) {
        if(c == 'a' || c == 'o' || c == 'u' || c == 'i' || c == 'e') {
            return true;
        }

        return false;
    }
};