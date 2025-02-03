class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        ans = 1

        for i in range(1, len(nums)):
            tmp = 1
            if nums[i - 1] > nums[i]:
                for j in range(i, len(nums)):
                    if nums[j - 1] > nums[j]:
                        tmp += 1
                    else:
                        break
            elif nums[i - 1] < nums[i]:
                for j in range(i, len(nums)):
                    if nums[j - 1] < nums[j]:
                        tmp += 1
                    else:
                        break
            else:
                continue
            ans = max(ans, tmp)

        return ans
        