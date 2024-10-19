class Solution {
    public char findKthBit(int n, int k) {
        return findKthBitHelper(n, k);
    }

    private char findKthBitHelper(int n, int k) {
        if (n == 1) return '0';  // Base case: S(1) = "0"
        
        int length = (1 << n) - 1;  // Độ dài của chuỗi S(n) là 2^n - 1
        int mid = length / 2 + 1;  // Vị trí chính giữa của chuỗi

        if (k == mid) {
            return '1';  // Vị trí chính giữa luôn là '1'
        } else if (k < mid) {
            return findKthBitHelper(n - 1, k);  // Nếu k ở nửa đầu, nó giống với chuỗi S(n-1)
        } else {
            // Nếu k ở nửa sau, ta tìm bit đối xứng và đảo bit
            char mirroredBit = findKthBitHelper(n - 1, length - k + 1);
            return mirroredBit == '0' ? '1' : '0';  // Đảo bit
        }
    }
}
