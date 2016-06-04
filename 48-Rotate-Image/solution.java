public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int [][] copy = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                copy[i][j]=matrix[j][i];
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matrix[i][j]=copy[i][n-j-1];
            }
        }
    }
}