func minimumSteps(s string) int64 {
    n := len(s)
    l, r := 0, n - 1
    var ans int64
    for l < r {
        if s[l] == '0' {
            l++
            continue
        }
        if s[r] == '1' {
            r--
            continue
        }
        ans += int64(r - l)
        r--
        l++
    }
    return ans
}