class Solution {
    public int findMinArrowShots(int[][] p) {
        Arrays.sort(p, Comparator.comparingInt(a -> a[1]));
        int start = 0, end = 0;;

        end = p[0][1];
        int re = 1;

        for(int i = 1; i < p.length; ++i){
            if(p[i][0] > end){
                ++re;
                end = p[i][1];
            }
        }
        return re;
    }
}