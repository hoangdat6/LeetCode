class Solution(object):
    def maximumDifference(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) <= 1:
            return -1
        ans = 0
        min_val = nums[0]

        for i in range(1, len(nums)):
            if nums[i] > min_val:
                ans = max(ans, nums[i] - min_val)
            else:
                min_val = nums[i]
        
        return ans if ans != 0 else -1