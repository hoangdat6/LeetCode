class Solution {
    public int islandPerimeter(int[][] g) {
        int re = 0;
        int n = g.length;
        int m = g[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; ++j){
                if(g[i][j] == 1){
                    re += 4;
                    if(i - 1 >= 0 && g[i - 1][j] == 1) re--;
                    if(j - 1 >= 0 && g[i][j - 1] == 1) re--;
                    if(i + 1 < n && g[i + 1][j] == 1) re--;
                    if(j + 1 < m && g[i][j + 1] == 1) re--;
                }
            }
        }
        return re;
    }

}