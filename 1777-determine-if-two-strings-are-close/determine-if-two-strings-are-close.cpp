class Solution {
public:
    bool closeStrings(string word1, string word2) {
        vector<int> freq1(27, 0), freq2(27, 0);

        for(auto c : word1) freq1[c - 'a']++;
        for(auto c : word2) freq2[c - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (freq1[i] > 0 ^ freq2[i] > 0) {
                return false;
            }
        }

        sort(freq1.begin(), freq1.end());
        sort(freq2.begin(), freq2.end());
        
        for(int i = 0; i < 27; ++i) {
            if(freq1[i] != freq2[i]) return false;
        }

        return true;
    }
};