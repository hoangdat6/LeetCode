class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        prev_val = nums[0]
        ans = 0

        for i in range(1, len(nums)):
            if nums[i] > prev_val:
                ans += 1
                nums[ans] = nums[i]
            prev_val = nums[i] 
        

        return ans + 1 
