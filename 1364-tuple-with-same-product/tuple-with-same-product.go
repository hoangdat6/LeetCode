func tupleSameProduct(nums []int) int {
    pairs := map[int]int{}
    ans, n := 0, len(nums)
    for i := 0; i < n; i++ {
        for j := i + 1; j < n; j++ {
            pairs[nums[i] * nums[j]]++
        }
    }
    for _, v := range pairs {
        ans += (v - 1) * v * 4
    }
    return ans
}
