class Solution {
public:
    int compress(vector<char>& chars) {
        chars.push_back('\0');

        int index = 0;
        int cnt = 1;
        char prev = chars[0];
        for(int i = 1; i < chars.size(); ++i) {
            if(chars[i] == prev) {
                cnt++;
            }else {
                chars[index ++] = prev;
                if(cnt > 1) {
                    auto repeat = to_string(cnt);
                    for(auto &d : repeat) {
                        chars[index++] = d;
                    }
                }

                prev = chars[i];
                cnt = 1;
            }

            if(prev == '\0') {
                chars.pop_back();
                return index;
            }
        }

        return -1;
    }
};