class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int cnt = 3;
        int t0 = 0, t1 = 1, t2 = 1;
        int t3 = 0;
        while(cnt < n){
            t3 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
            cnt ++;
        }

        return t0 + t1 + t2;
    }
}