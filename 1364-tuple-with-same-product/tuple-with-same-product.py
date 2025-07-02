class Solution(object):
    def tupleSameProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        map = defaultdict(int)
        
        n = len(nums)
        for i in range(n):
            for j in range(i + 1, n):
                map[nums[i] * nums[j]] += 1

        res = 0
        for k, v in map.items():
            res += v * (v - 1) * 4

        return res