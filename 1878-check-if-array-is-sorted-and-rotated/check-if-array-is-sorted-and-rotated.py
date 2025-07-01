class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        tmp = len(nums) - 1
        for i in range(1, len(nums)):
            if nums[i] >= nums[i - 1]:
                tmp -= 1

        if nums[len(nums) - 1] <= nums[0]:
            tmp -= 1

        print(tmp)
        return True if tmp <= 0 else False
        