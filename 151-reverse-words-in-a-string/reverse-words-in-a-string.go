func reverseWords(s string) string {
    var ans string = ""
    len2 := len(s)

    isWord := false
    var start = len2 - 1
    for i := len2 - 1; i >= 0; i-- {
        if(!isWord && s[i] != ' ') {
            start = i;
            isWord = true;
        }

        if(isWord && s[i] == ' ') {
            ans += s[i + 1:start + 1] + " "
            isWord = false
        }
    }


    if(isWord) {
        ans += s[0:start + 1] + " "
    }

    var len1 int = len(ans)
    return ans[:len1 - 1];
}