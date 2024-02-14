class Solution {
public:
  int lengthOfLongestSubstring(string s) {
        unordered_map<int, int> map;
        int left = 0;
        int right = 0;
        int max = 0;

        while(right < s.size()){
            if(map[s[right]] != 0){
                map[s[left]]--;
                left ++;
            }else{
                map[s[right]] ++;
                ++right;
            }
            max = (max > right - left) ? max : right - left;
        }
        return max;
        }
};