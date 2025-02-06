class Solution:
    def tupleSameProduct(self, nums: List[int]) -> int:
        n = len(nums)
        product_count_map = defaultdict(int)
        
        result = 0
        for i in range(n):
            for j in range(i + 1, n):
                product = nums[i] * nums[j]
                count = product_count_map[product]
                if count:
                    result += 8 * count
                product_count_map[product] += 1
        
        return result
         