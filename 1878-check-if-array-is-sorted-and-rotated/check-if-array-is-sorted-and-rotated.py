class Solution:
    def check(self, nums: List[int]) -> bool:

        for i in range(0, len(nums)):
            ans = True
            for j in range(0, len(nums) - 1):
                if nums[(i + j) % len(nums)] > nums[(i + j + 1) % len(nums)]:
                    ans = False
            if ans == True:
                return ans
            
        return False
