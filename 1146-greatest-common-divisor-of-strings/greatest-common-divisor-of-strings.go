func gcdOfStrings(str1 string, str2 string) string {
    if str1 + str2 != str2 + str1 {
        return ""
    }

    var gcd1 int = gcd(len(str1), len(str2))

    return str1[:gcd1];
}

func gcd(a int, b int) int {
    if(b == 0) {
        return a;
    }

    return gcd(b, a % b)
}