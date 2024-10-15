func minimumSteps(s string) int64 {
    n := len(s)
    var ans int64 = 0

    cnt0 := 0

    for i := n - 1; i >= 0; i-- {
        if s[i] == '0' {
            cnt0++
        } else {
            ans += int64(cnt0)
        }
    }

    return ans
}
