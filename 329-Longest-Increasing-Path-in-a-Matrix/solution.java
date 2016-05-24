public class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        if (m==0) return 0;
        int n = matrix[0].length;
        int[][] count = new int[m][n];
        int res = 1;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                int cur = helper(matrix,i,j,count);
                res=Math.max(res,cur);
            }
        }
        return res;
    }
    public int helper(int[][] matrix, int i, int j, int[][] count){
        if (count[i][j]!=0) return count[i][j];
        int m = matrix.length;
        int n = matrix[0].length;
        int len = 1;
        if (i+1<m && matrix[i+1][j]>matrix[i][j]) len=Math.max(len,1+helper(matrix,i+1,j,count));
        if (i-1>=0 && matrix[i-1][j]>matrix[i][j]) len=Math.max(len,1+helper(matrix,i-1,j,count));
        if (j-1>=0 && matrix[i][j-1]>matrix[i][j]) len=Math.max(len,1+helper(matrix,i,j-1,count));
        if (j+1<n && matrix[i][j+1]>matrix[i][j]) len=Math.max(len,1+helper(matrix,i,j+1,count));
        count[i][j]=len;
        return len;
    }
}