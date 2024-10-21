class Solution {
public:
    int maxUniqueSplit(string s) {
        unordered_set<string> set;
        return backtrack(set, s, 0);
    }

    int backtrack(unordered_set<string>& set, string& s, int start) {
        if(start == s.size()) {
            return 0;
        }

        int maxSplits = 0;
        for(int end = start + 1; end <= s.size(); ++end) {
            string substring = s.substr(start, end - start);
            if(set.find(substring) == set.end()) {
                set.insert(substring);
                maxSplits = max(maxSplits, 1 + backtrack(set, s, end));
                set.erase(substring);
            }
        }

        return maxSplits;
    }
};