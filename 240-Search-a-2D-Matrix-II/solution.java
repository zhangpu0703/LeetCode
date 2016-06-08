public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i=0; i<m; i++){
            int start = 0;
            int end = n-1;
            while (start<end){
                int mid = start+(end-start)/2;
                if (matrix[i][mid]==target) return true;
                if (matrix[i][mid]>target) end = mid;
                else start = mid+1;
            }
            if (matrix[i][start]==target) return true;
        }
        return false;
    }
}