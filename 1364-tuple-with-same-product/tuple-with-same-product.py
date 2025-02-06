class Solution:
    def tupleSameProduct(self, nums: List[int]) -> int:
        map = dict()
        
        n = len(nums)

        ans = 0
        for i in range(n):
            for j in range(i + 1, n):
                mul = nums[i] * nums[j]
                cnt = map.get(mul)
                if cnt:
                    ans += 8 * cnt
                    map[mul] += 1
                else:
                    map[mul] = 1
        
        return ans
         