class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
          ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
        long long product = 1;
        
        int cnt0 = 0, cnt = 0;
        for(int i = 0; i < nums.size(); ++i) {
            if(nums[i] != 0) {
                product *= nums[i];
                cnt ++;
            }else {
                cnt0 ++;
            }
        }

        vector<int> ans(nums.size());

        for(int i = 0; i < nums.size(); ++i) {
            if(cnt0 >= 2 || cnt == 0) {
                ans[i] = 0;
                continue;
            }else {
                if(nums[i] == 0) {
                    ans[i] = product;
                }else {
                    if(cnt0 != 0) {
                        ans[i] = 0;
                    }else {
                        ans[i] = product / nums[i];
                    }
                }
            }
        }

        return ans;
    }
};