class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> map;
        int j;
        for(int i = 0; i < nums.size(); ++i){
            map[nums[i]] = i + 1;
        }
        for(int i = 0; i < nums.size(); ++i){
            j = target - nums[i];
            if(map[j] != 0 && map[j] != i + 1){
                return {i, map[j] - 1};
            }

        }
        return {};
    }
};