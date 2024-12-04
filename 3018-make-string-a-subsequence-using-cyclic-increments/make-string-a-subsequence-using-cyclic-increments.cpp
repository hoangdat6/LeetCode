class Solution {
public:
    bool canMakeSubsequence(string str1, string str2) {
        int i1 = 0, i2 = 0;
        while(i1 < str1.size() && i2 < str2.size()) {
            if(str1[i1] == str2[i2] || (str1[i1] == 'z' && str2[i2] == 'a') || str1[i1] + 1 == str2[i2]) {
                i2++;
            }
            i1 ++;
        }

        return i2 == str2.size();
    }
};