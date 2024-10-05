class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        // Tạo hai mảng đếm ký tự, một cho s1 và một cho s2
        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        // Điền tần số xuất hiện của các ký tự trong s1
        for (char c : s1.toCharArray()) {
            s1Map[c - 'a']++;
        }

        // Lấy độ dài của s1 và s2
        int len1 = s1.length();
        int len2 = s2.length();

        // Lặp qua s2 với sliding window
        for (int i = 0; i < len2; i++) {
            // Thêm ký tự hiện tại vào cửa sổ
            s2Map[s2.charAt(i) - 'a']++;

            // Loại bỏ ký tự ngoài cửa sổ (cửa sổ chỉ có độ dài len1)
            if (i >= len1) {
                s2Map[s2.charAt(i - len1) - 'a']--;
            }

            // So sánh hai mảng đếm ký tự
            if (matches(s1Map, s2Map)) {
                return true;
            }
        }

        return false;
    }

    // Hàm so sánh hai mảng tần số
    private boolean matches(int[] s1Map, int[] s2Map) {
        for (int i = 0; i < 26; i++) {
            if (s1Map[i] != s2Map[i]) {
                return false;
            }
        }
        return true;
    }
}
