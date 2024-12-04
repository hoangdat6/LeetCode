class Solution {
public:
    bool canMakeSubsequence(string str1, string str2) {
        int i1 = 0, i2 = 0;
        int len1 = str1.size(), len2 = str2.size();
        while(i1 < len1 && i2 < len2) {
            if(str1[i1] == str2[i2] || str1[i1] + 1 == str2[i2] || (str1[i1] == 'z' && str2[i2] == 'a')) {
                i2++;
            }
            i1 ++;
        }

        return i2 == len2;
    }
};