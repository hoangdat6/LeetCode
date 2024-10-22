class Solution {
public:
    int maxVowels(std::string s, int k) {
        std::unordered_set<char> vowels = {'a', 'e', 'i', 'o', 'u'};
        int cnt = 0;

        for (int i = 0; i < k; ++i) {
            cnt += vowels.count(s[i]);
        }

        int ans = cnt;

        for (int i = k; i < s.size(); ++i) {
            cnt += vowels.count(s[i]) - vowels.count(s[i - k]);
            ans = std::max(ans, cnt);
        }

        return ans;
    }
};