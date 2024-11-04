class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        map<int, int> map1, map2;

        for(int i = 0; i < nums1.size(); ++i) {
            map1[nums1[i]]++;
        }

        for(int i = 0; i < nums2.size(); ++i) {
            map2[nums2[i]]++;
        }

        vector<vector<int>> ans(2, vector<int>(0));
        for(auto m1 : map1) {
            if(map2[m1.first] == 0) {
                ans[0].push_back(m1.first);
            }
        }

        for(auto m2 : map2) {
            if(map1[m2.first] == 0) {
                ans[1].push_back(m2.first);
            }
        }

        return ans;
    }
};