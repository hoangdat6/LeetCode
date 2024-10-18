import "strings"

func reverseWords(s string) string {
    var builder strings.Builder
    len2 := len(s)

    isWord := false
    var start int

    for i := len2 - 1; i >= 0; i-- {
        if !isWord && s[i] != ' ' {
            start = i
            isWord = true
        }

        if isWord && (i == 0 || s[i-1] == ' ') {
            if builder.Len() > 0 {
                builder.WriteByte(' ') 
            }
            builder.WriteString(s[i:start+1])
            isWord = false
        }
    }

    return builder.String()
}
