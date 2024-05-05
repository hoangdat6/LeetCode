class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);

        int n = p.length;
        int re = 0;
        int left = 0, right = n - 1;

        while(left < right){
            if(p[left] + p[right] <= limit){
                left++; right--;
            }else{
                right--;
            }
            re++;
        }
        if(left == right) re++;

        return re;
    }
}