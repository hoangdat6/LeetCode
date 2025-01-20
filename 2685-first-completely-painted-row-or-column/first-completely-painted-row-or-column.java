import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, int[]> positionMap = new HashMap<>();
        int[] rowCounts = new int[m];
        int[] colCounts = new int[n];

        // Ánh xạ giá trị trong `mat` tới chỉ số dòng và cột
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                positionMap.put(mat[i][j], new int[]{i, j});
            }
        }

        // Duyệt qua các giá trị trong `arr`
        for (int i = 0; i < arr.length; ++i) {
            int[] pos = positionMap.get(arr[i]);
            int row = pos[0], col = pos[1];

            // Giảm số ô chưa hoàn thành của hàng và cột tương ứng
            if (++rowCounts[row] == n || ++colCounts[col] == m) {
                return i;
            }
        }

        return -1;
    }
}
