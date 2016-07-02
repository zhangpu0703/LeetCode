public class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        if (m == 0) return; 
        int n = board[0].length;
        for (int i=0; i<m; i++){
            if (board[i][0]=='O'){
                update(board,i,0);
            }
            if (board[i][n-1] == 'O'){
                update(board,i,n-1);
            }
        }
        for (int j=0; j<n; j++){
            if (board[0][j]=='O'){
                update(board,0,j);
            }
            if (board[m-1][j] == 'O'){
                update(board,m-1,j);
            }
        }
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (board[i][j] == 'O') board[i][j]='X';
                if (board[i][j] == '*') board[i][j]='O';
            }
        }
    }
    public void update(char[][] board, int i, int j){
        if (i<0 || i>=board.length || j<0 || j>=board[0].length) return;
        if (board[i][j]=='O') board[i][j]='*';
        if (i>0 && board[i-1][j]=='O') update(board,i-1,j);
        if (i<board.length-2 && board[i+1][j]=='O') update(board,i+1,j);
        if (j>0 && board[i][j-1]=='O') update(board,i,j-1);
        if (j<board[0].length-2 && board[i][j+1]=='O') update(board,i,j+1);
    } 
}