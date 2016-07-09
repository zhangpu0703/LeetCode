public class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] area = new int[m][n];
        area[0][0]=matrix[0][0];
        for (int j = 1; j<n; j++){
            area[0][j]=area[0][j-1]+matrix[0][j];
        }
        for (int i = 1; i<m; i++){
            area[i][0]=area[i-1][0]+matrix[i][0];
        }
        for (int i = 1; i<m; i++){
            for (int j=1; j<n; j++){
                area[i][j] = area[i-1][j]+matrix[i][j]+area[i][j-1]-area[i-1][j-1];
            }
        }
        //int diff = Integer.MAX_VALUE;
        int res = Integer.MIN_VALUE;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                for (int r = i; r < m; r++){
                    for (int c = j; c<n; c++){
                        int cur=area[r][c];
                        if (i>0) cur -= area[i-1][c];
                        if (j>0) cur -= area[r][j-1];
                        if (i>0 && j>0) cur+=area[i-1][j-1];
                        if (cur<=k) res = Math.max(res,cur);
                    }
                }

            }
        }
        return res;
    }
}