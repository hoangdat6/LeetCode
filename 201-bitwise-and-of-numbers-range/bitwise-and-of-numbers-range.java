class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left == right) return left;
        int k = 1;
        int b;
        for(int i = 1; i < 32; ++i){
            if(Math.pow(2, i) > left){
                k = i;
                break;
            }
        }
        if((long)Math.pow(2, k) <= right){
            return 0;
        }else{
            b = left;
            for(long i = left + 1; i <= right; ++i){
                b = b & (int)i;
            }
            return b;
        }
    }
}