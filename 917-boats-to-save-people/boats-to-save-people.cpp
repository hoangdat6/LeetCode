const int ZERO = []()
{
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(nullptr);
	return 0;
}();

class Solution {
public:
    int numRescueBoats(vector<int>& p, int limit) {
        int re = 0;
        
        vector<int> buckets(limit + 1, 0);

        for(int i : p){
            buckets[i]++;
        }

        int left = 0, right = limit;

        while(left <= right){
            while(left <= right && buckets[left] <= 0) left++;
            while(left <= right && buckets[right] <= 0) right--;

            if(buckets[left] <= 0 && buckets[right] <= 0) break;
            re++;

            if(left + right <= limit){
                buckets[left]--;
            }
            buckets[right]--;

        }

        return re;
    }
};