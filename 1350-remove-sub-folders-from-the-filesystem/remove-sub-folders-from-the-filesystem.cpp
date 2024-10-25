
class Solution {
public:
    vector<string> removeSubfolders(vector<string>& folder) {
        sort(folder.begin(), folder.end());

        vector<string> ans;

        for(int i = 0; i < folder.size(); ++i) {
            int size = ans.size();
            if(size == 0) {
                ans.push_back(folder[i]);
            }else {
                if(!(folder[i].substr(0, ans[size - 1].size()) == ans[size - 1] 
                    && folder[i][ans[size - 1].size()] == '/')) {
                    ans.push_back(folder[i]);
                }
            }
        }

        return ans;
    }
};