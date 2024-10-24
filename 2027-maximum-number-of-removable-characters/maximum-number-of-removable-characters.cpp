class Solution {
public:
    int maximumRemovals(string s, string p, vector<int>& removable) {
        int n = s.size();

        int left = 0, right = removable.size();

        while(left < right) {
            int mid = left + (right - left + 1) / 2;

            if(checkSubsequence(s, p, removable, mid)) {
                left = mid;
            }else {
                right = mid - 1;
            }
        }
 
        return left;
    }

    bool checkSubsequence(string s, string p, vector<int>& removable, int r) {
        vector<bool> isRemoved(s.size(), false);
        for(int i = 0; i < r; ++i) {
            isRemoved[removable[i]] = true;
        }

        int i = 0; 
        int j = 0;  

        while (i < p.size() && j < s.size()) {
            if (!isRemoved[j] && s[j] == p[i]) {
                i++;
            }

            j++;
        }

        return i == p.size();
    }
};