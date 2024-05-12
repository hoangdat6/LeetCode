class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] re = new int[grid.length - 2][grid.length - 2];

        for(int i = 0; i < grid.length - 2; ++i){
            for(int j = 0; j < grid.length - 2; ++j){
                int max = 0;
                for(int k = i; k < i + 3; ++k){
                    for(int h = j; h < j + 3; ++h){
                        max = Math.max(max, grid[k][h]);
                    }
                }
                re[i][j] = max;
            }
        }
        return re;
    }
}