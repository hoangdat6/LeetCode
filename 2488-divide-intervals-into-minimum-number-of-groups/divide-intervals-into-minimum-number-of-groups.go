func minGroups(intervals [][]int) int {
    rangeStart := math.MaxInt
    rangeEnd := math.MinInt
    for _, interval := range intervals {
        rangeStart = min(rangeStart, interval[0])
        rangeEnd = max(rangeEnd, interval[1])
    }

    pointToCount := make([]int, rangeEnd + 2)

    for _, interval := range intervals {
        pointToCount[interval[0]]++
        pointToCount[interval[1] + 1]--
    }


    concurrentIntervals := 0
    maxConcurrentIntervals := 0
    for i := rangeStart; i <= rangeEnd; i++ {
        concurrentIntervals += pointToCount[i]
        maxConcurrentIntervals = max(maxConcurrentIntervals, concurrentIntervals)
    }

    return maxConcurrentIntervals
}