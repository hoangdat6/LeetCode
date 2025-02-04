class Solution(object):
    def maxAscendingSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        inc_sum, max_sum = nums[0], nums[0]
        for i, value in enumerate(nums[1:], start = 1):
            if (nums[i] > nums[i - 1]):
                inc_sum += nums[i]
            else:
                inc_sum = nums[i]
            max_sum = max(max_sum, inc_sum)

        return max_sum
        