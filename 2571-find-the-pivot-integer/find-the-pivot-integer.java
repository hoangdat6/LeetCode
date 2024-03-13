class Solution {
    public int pivotInteger(int n) {
        int re = -1;
        int sum = 0;

        for(int i = n; i >= 1; i--){
            sum += i;

            if(sum == i * (i + 1) / 2) return i;
        }

        return re;
    }
}