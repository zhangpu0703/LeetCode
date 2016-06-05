public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int m = matrix.length;
        if (m==0) return res;
        int n = matrix[0].length;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        while (left<=right && top<=bottom){
            for (int j = left; j<=right; j++){
                res.add(matrix[top][j]);
            }
            top++;
            for (int i=top; i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
            if (top<=bottom){
                for (int j = right; j>=left; j--){
                    res.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if (left<=right){
                for (int i=bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }

        }
        return res;
    }
}