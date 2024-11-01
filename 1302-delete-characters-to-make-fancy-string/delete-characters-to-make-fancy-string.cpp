class Solution {
public:
    string makeFancyString(string s) {
        string ans = "";
        
        int cnt = 0;
        for(auto c : s) {
            if(ans.size() > 0 && c == ans[ans.size() - 1]) cnt++;
            else cnt = 0;
            if(cnt >= 2) continue;
            ans += c;
        }

        return ans;
    }
};