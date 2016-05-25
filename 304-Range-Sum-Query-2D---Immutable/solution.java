public class NumMatrix {
    private int[][] sumMatrix; 
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = 0;
        if (m>0) n = matrix[0].length;
        sumMatrix = new int[m][n];
        for (int i=0; i<m; i++){
            int sum = 0;
            for (int j=0; j<n; j++){
                sum+=matrix[i][j];
                sumMatrix[i][j]=sum;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for (int i=row1; i<=row2; i++){
            if (col1==0) sum+=sumMatrix[i][col2];
            else sum+=sumMatrix[i][col2]-sumMatrix[i][col1-1];
        }
        return sum;
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);