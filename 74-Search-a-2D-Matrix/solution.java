public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int rowStart = 0;
        int rowEnd = m-1;
        int colStart = 0;
        int colEnd = n-1;
        while (rowStart < rowEnd){
            int mid = rowStart+(rowEnd-rowStart)/2;
            if (matrix[mid][n-1]==target) return true;
            else if (matrix[mid][n-1]>target) rowEnd = mid;
            else rowStart = mid+1;
        }
        
        while (colStart<colEnd){
            int mid = colStart+(colEnd-colStart)/2;
            if (matrix[rowStart][mid]==target) return true;
            else if (matrix[rowStart][mid]>target) colEnd = mid;
            else colStart=mid+1;
        }
        
        return matrix[rowStart][colStart]==target;
    }
}