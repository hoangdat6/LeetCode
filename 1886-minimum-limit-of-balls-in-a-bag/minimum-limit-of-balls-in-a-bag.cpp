class Solution {
public:
    int minimumSize(vector<int>& nums, int maxOperations) {
        int left = 1, right = 1e9;
        
        while(left < right) {
            int mid = (right + left) / 2, opers = 0;

            for(auto num : nums) {
                opers += (num - 1) / mid;
            }

            if(opers > maxOperations) left = mid + 1;
            else right = mid;
        }

        return left;
        
    }
};