public class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        if (m==0) return;
        int n = board[0].length;
        for (int i=0; i<m; i++){
            if (board[i][0]=='O') helper(board,i,0);
            if (board[i][n-1]=='O') helper(board,i,n-1);
        }
        for (int j=0; j<n; j++){
            if (board[0][j]=='O') helper(board,0,j);
            if (board[m-1][j]=='O') helper(board,m-1,j);
        }
        for (int i=0; i<m; i++){
            for (int j=0; j<n;j++){
                if (board[i][j] == 'O') board[i][j]='X';
                else if (board[i][j]=='#') board[i][j]='O';
            }
        }
    }
    
    public void helper(char[][] board, int i, int j){
        int m = board.length, n = board[0].length;
        if (i<0 || i>=m || j<0 || j>=n) return;
        //if (board[i][j]=='X') return;
        if (board[i][j]=='O') {
            board[i][j]='#';
            if (i>0 && board[i-1][j]=='O') helper(board,i-1,j);
            if (i<board.length-2 && board[i+1][j]=='O') helper(board,i+1,j);
            if (j>0 && board[i][j-1]=='O') helper(board,i,j-1);
            if (j<board[0].length-2 && board[i][j+1]=='O') helper(board,i,j+1);
        }
    }
}