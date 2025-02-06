func tupleSameProduct(nums []int) int {
    pairs := map[int]int{}
    ans, n := 0, len(nums)
    for i := 0; i < n; i++ {
        for j := i + 1; j < n; j++ {
            product := nums[i] * nums[j]
            if pairs[product] > 0 {
                ans += pairs[product] * 8
            }
            pairs[product]++
        }
    }

    return ans
}
