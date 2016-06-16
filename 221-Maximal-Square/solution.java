public class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        if (m==0) return 0;
        int n = matrix[0].length;
        int[][] length = new int[m+1][n+1];
        int res = 0;
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                if (matrix[i-1][j-1]=='1'){
                    length[i][j]=1+Math.min(length[i-1][j-1],Math.min(length[i][j-1], length[i-1][j]));
                    res = Math.max(res,length[i][j]);
                }
            }
        }
        return res*res;
    }
}