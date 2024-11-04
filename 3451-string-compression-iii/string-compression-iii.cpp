

class Solution {
public:
    string compressedString(string word) {
        
        if(word.size() == 0) return "";
        string ans;

        int cnt = 1;
        for(int i = 0; i < word.size() - 1; ++i) {
            if(word[i] == word[i + 1]) {
                ++cnt;
            } else {
                if(cnt > 9) {
                    while(cnt >= 9) {
                        ans.push_back('9');
                        ans.push_back(word[i]);
                        cnt -= 9;
                    }
                    if(cnt != 0) {
                        ans.push_back('0' + cnt);
                        ans.push_back(word[i]);
                    }
                } else {
                    ans.push_back('0' + cnt);
                    ans.push_back(word[i]);
                }
                cnt = 1;
            }
        }

        if(cnt > 9) {
            while(cnt >= 9) {
                ans.push_back('9');
                ans.push_back(word[word.size() - 1]);
                cnt -= 9;
            }
            if(cnt != 0) {
                ans.push_back('0' + cnt);
                ans.push_back(word[word.size() - 1]);
            }
        } else {
            ans.push_back('0' + cnt);
            ans.push_back(word[word.size() - 1]);
        }

        return ans;
    }
};
