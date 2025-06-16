class Solution(object):
    def maximumDifference(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) <= 1:
            return -1
        ans = 0

        for i in range(0, len(nums) - 1):
            for j in range(i + 1, len(nums)):
                ans = max(ans, nums[j] - nums[i])
        
        return ans if ans != 0 else -1