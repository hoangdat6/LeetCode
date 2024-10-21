class Solution {
public:
    int maxUniqueSplit(string s) {
        unordered_map<string, int> map;
        return backtrack(map, s, 0);
    }

    int backtrack(unordered_map<string, int>& map, string& s, int start) {
        if(start == s.size()) {
            return 0;
        }

        int maxSplits = 0;
        for(int end = start + 1; end <= s.size(); ++end) {
            string substring = s.substr(start, end - start);
            if(map[substring] == 0) {
                map[substring] ++;
                maxSplits = max(maxSplits, 1 + backtrack(map, s, end));
                map[substring] --;
            }
        }

        return maxSplits;
    }
};