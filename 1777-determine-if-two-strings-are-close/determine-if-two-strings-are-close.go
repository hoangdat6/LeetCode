func closeStrings(word1 string, word2 string) bool {
    if len(word1) != len(word2) {
        return false
    }


    nums1 := make([]int, 27)
    nums2 := make([]int, 27)

    for i := 0; i < len(word1); i++ {
        nums1[word1[i]-'a']++
        nums2[word2[i]-'a']++
    }

    for i := 0; i < len(nums1); i++ {
        if nums1[i] > 0 && nums2[i] > 0 {
            continue
        } else if nums1[i] == 0 && nums2[i] == 0 {
            continue
        } else {
            return false
        }
    }

    sort.Ints(nums1)
    sort.Ints(nums2)
    for i := 0; i < len(nums1); i++ {
        if nums1[i] != nums2[i] {
            return false
        }
    }
    
    return true
}