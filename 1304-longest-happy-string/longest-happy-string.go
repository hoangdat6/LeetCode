func longestDiverseString(a int, b int, c int) string {
    curra, currb, currc := 0, 0, 0

    sum := a + b + c
    var ans string = ""
    for i := 0;  i < sum; i++ {
        if (a >= c && a >= b && curra != 2) || (a > 0 && (currb == 2 || currc == 2)) {
            ans += "a"
            curra ++;
            a --;
            currb = 0;
            currc = 0;
        }else if (b >= c && b >= a && currb != 2) || (b > 0 && (curra == 2 || currc == 2)) {
            ans += "b"
            currb ++;
            b --;
            curra = 0;
            currc = 0;
        }else if (c >= a && c >= b && currc != 2) || (c > 0 && (currb == 2 || curra == 2)) {
            ans += "c"
            currc ++;
            c --;
            curra = 0;
            currb = 0;
        }
        
    }

    return ans;
}