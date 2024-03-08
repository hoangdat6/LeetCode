class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        map<int, int> map;
        for(int i = 0; i < nums.size(); ++i){
            map[nums[i]] ++;
        }
        
        int max1 = 0;
        for(auto m : map){
            max1 = max(max1, m.second);
        }
        int sum = 0;
        for(auto m : map){
            if(m.second == max1){
                sum += m.second;
            }
        }
        
        return sum;
    }
};