class Solution(object):
    def maxSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        map = defaultdict(int)

        max1 = -1000
        for num in nums:
            map[num] = True
            max1 = max(max1, num)
        
        ans = max1
        for key in map.keys():
            if key != max1:
                ans = max(key + ans, ans)
        return ans