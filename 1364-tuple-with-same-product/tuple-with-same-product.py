class Solution(object):
    def tupleSameProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        map = defaultdict(int)
        
        res = 0
        n = len(nums)
        for i in range(n):
            for j in range(i + 1, n):
                product = nums[i] * nums[j] 
                if product in map:
                    res += map[product] * 8
                map[product] += 1

        return res
