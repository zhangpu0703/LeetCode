public class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int res = 1;
        int[][] length = new int[matrix.length][matrix[0].length];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                res = Math.max(res,genLen(i,j,matrix,length));
            }
        }
        return res;
    }
    public int genLen (int i, int j, int[][] matrix, int[][] count){
        //if (i<0 || i>=matrix.length || j<0 || j>=matrix[i].length) return 0;
        if (count[i][j]!=0) return count[i][j];
        int len = 1;
        if (i<matrix.length-1 && matrix[i+1][j]>matrix[i][j]) len = Math.max(len,1+genLen(i+1,j,matrix,count));
        if (i>0 && matrix[i-1][j]>matrix[i][j]) len = Math.max(len,1+genLen(i-1,j,matrix,count));
        if (j>0 && matrix[i][j-1]>matrix[i][j]) len = Math.max(len,1+genLen(i,j-1,matrix,count));
        if (j<matrix[i].length-1 && matrix[i][j+1]>matrix[i][j]) len = Math.max(len,1+genLen(i,j+1,matrix,count));
        count[i][j]=len;
        return len;
    }
}