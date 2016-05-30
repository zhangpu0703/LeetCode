public class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        if (m==0) return;
        int n= board[0].length;
        int[][] res = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                int num = liveno(board,i,j);
                if (board[i][j]==1 && (num == 2 || num == 3)) res[i][j]=1;
                else if (board[i][j]==0 && num == 3) res[i][j]=1;
                else res[i][j]=0;
            }
        }
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                board[i][j]=res[i][j];
            }
        }
        
    }
    public int liveno (int[][] board, int i, int j){
        int res = 0;
        int m = board.length;
        int n = board[0].length;
        int rowStart = i-1;
        int rowEnd = i+1;
        int colStart = j-1;
        int colEnd = j+1;
        if (rowStart<0) rowStart = 0;
        if (rowEnd>=m) rowEnd = m-1;
        if (colStart<0) colStart = 0;
        if (colEnd>=n) colEnd = n-1;
        
        for (int k = rowStart; k<=rowEnd; k++){
            for (int l= colStart; l<=colEnd; l++){
                if (k==i && l==j) continue;
                if (board[k][l]==1) res++;
            }
        }
        return res;
    }
}