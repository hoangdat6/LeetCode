class Solution {
    public String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;

        char c[] = s.toCharArray();
        
        while(left < right) {
            while(left < right && !checkVowel(c[left]))
            {
                left++;
            }
            while(left < right && !checkVowel(c[right])) 
            {
                right--;
            }
            if(left < right) {
                char tmp = c[left];
                c[left] = c[right];
                c[right] = tmp;
                left++;
                right--;
            }
        }

        
        return String.valueOf(c);
    }

    boolean checkVowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
            return true;
        }
        return false;
    }
}