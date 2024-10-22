#include <vector>
#include <algorithm>
#include <iostream>

class Solution {
public:
    int longestOnes(std::vector<int>& nums, int k) {
        int cnt = 0; 
        int j = 0; 

        for (int i = 0; i < nums.size(); ++i) {
            if (nums[i] == 0) {
                k--;
            }
            while (k < 0) {
                if (nums[j] == 0) {
                    k++; 
                }
                j++; 
            }
            cnt = std::max(cnt, i - j + 1);
        }

        return cnt;
    }
};
