class Solution {
public:
    int maximumRemovals(string s, string p, vector<int>& removable) {
        int n = s.size();
        int ans = 0;

        int left = 0, right = removable.size();

        while(left <= right) {
            int mid = left + (right - left) / 2;
            string s1 = s;

            for(int i = 0; i < mid; ++i) {
                s1[removable[i]] = '*';
            }

            int l = p.size(), k = 0;
            for(int i=0; i < s1.size() && k < l; i++){
                if(s1[i] == p[k])
                    k++;
            }

            if(l == k) {
                ans = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
 
        return ans;
    }

   
};