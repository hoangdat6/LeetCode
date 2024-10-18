func countMaxOrSubsets(nums []int) int {
    var maxBitWise = nums[0]

    for i := 1; i < len(nums); i++ {
        maxBitWise |= nums[i]
    }
    
    var count int = 0;

    countSubnets(nums, 0, 0, maxBitWise, &count)

    return count
}

func countSubnets(nums []int, index int, currentOr int, maxOr int, count *int) {
    if currentOr == maxOr {
        *count++
    }

    for i := index; i < len(nums); i++ {
        countSubnets(nums, i + 1, currentOr | nums[i], maxOr, count)
    }
}