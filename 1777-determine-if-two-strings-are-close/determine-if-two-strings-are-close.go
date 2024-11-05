func closeStrings(word1 string, word2 string) bool {
    freq1 := [26]int{}
    freq2 := [26]int{}

    for _, c := range word1 {
        freq1[c - 'a']++
    }

    for _, c := range word2 {
        freq2[c - 'a']++
    }

    for i := 0; i < 26; i++ {
        if (freq1[i] > 0) != (freq2[i] > 0) {
            return false
        }
    }

    sort.Ints(freq1[:])
    sort.Ints(freq2[:])

    for i := 0; i < 26; i++ {
        if freq1[i] != freq2[i] {
            return false;
        } 
    }
    return true;
}