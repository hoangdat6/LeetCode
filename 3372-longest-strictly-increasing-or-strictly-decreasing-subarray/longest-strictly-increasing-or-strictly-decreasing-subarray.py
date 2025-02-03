class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        inc_len, dec_len, max_len = 1, 1, 1
        for i, value in enumerate(nums[1:], start = 1):
            if (nums[i] > nums[i - 1]):
                inc_len += 1
                dec_len = 1
            elif (nums[i] < nums[i - 1]):
                dec_len += 1
                inc_len = 1
            else:
                inc_len = 1
                dec_len = 1
            max_len = max(max_len, inc_len, dec_len)

        return max_len 
        