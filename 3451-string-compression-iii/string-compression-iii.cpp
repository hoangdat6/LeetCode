class Solution {
public:
    string compressedString(string word) {
        if(word.size() == 0) return "";
        string ans = "";

        int cnt = 1;
        for(int i = 0; i < word.size() - 1; ++i) {
            if(word[i] == word[i + 1]) {
                ++cnt;
                if(cnt == 9) {
                    ans += to_string(9) + word[i];
                    cnt = 0;
                }
            }
            else {
                if(cnt == 0) {
                    cnt = 1;
                    continue;
                }
                ans += to_string(cnt) + word[i];
                cnt = 1;
            }
        }
        if(cnt != 0) {
            ans += to_string(cnt) + word[word.size() - 1];
        }

        return ans;
    }
};