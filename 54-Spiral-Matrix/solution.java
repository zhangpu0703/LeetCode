public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int m = matrix.length;
        if (m==0) return res;
        int n = matrix[0].length;
        int left = 0, right = n-1, top = 0, bottem = m-1;
        while (left<=right && top<=bottem){
            for (int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            top++;
            for (int i=top; i<=bottem; i++){
                res.add(matrix[i][right]);
            }
            right--;
            if (top<=bottem){
                for (int i=right; i>=left; i--){
                    res.add(matrix[bottem][i]);
                }
                bottem--;
            }
            if (left<=right){
                for (int i=bottem; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}