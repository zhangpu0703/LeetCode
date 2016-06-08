public class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int[][] res = new int[n][n];
        if (n==0) return res;
        int cur = 1;
        while (top<=bottom && left <= right){
            for (int j=left; j<=right; j++){
                res[top][j]=cur;
                cur++;
            }
            top++;
            for (int i=top; i<=bottom; i++){
                res[i][right]=cur;
                cur++;
            }
            right--;
            if (top<=bottom){
                for (int j=right; j>=left; j--){
                    res[bottom][j]=cur;
                    cur++;
                }
                bottom--;
            }
            if (left<=right){
                for (int i=bottom; i>=top; i--){
                    res[i][left]=cur;
                    cur++;
                }
                left++;
            }
        }
        return res;
    }
}