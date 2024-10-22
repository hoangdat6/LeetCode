class Solution {
public:
    int compress(vector<char>& chars) {
        string s = "";

        int cnt = 1;
        char prev = chars[0];
        for(int i = 1; i < chars.size(); ++i) {
            if(chars[i] == prev) {
                cnt++;
            }else {
                s += prev;

                if(cnt > 1) {
                    s += to_string(cnt);
                }
                prev = chars[i];
                cnt = 1;
            }
        }

        if(cnt == 1) s += prev;

        if(cnt > 1) {
            s += prev;
            s += to_string(cnt);
        }

        vector<char> char2(s.size());
        for(int i = 0; i < s.size(); ++i) {
            char2[i] = s[i];
        }
        chars = char2;

        return s.size();
    }
};