public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        if (word.length()==0) return false;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (helper(board,word,i,j,0)) return true;
            }
        }
        return false;
    }
    public boolean helper(char[][] board, String word, int i, int j, int ind){
        if (ind == word.length()) return true;
        if (i<0 || i>board.length-1 || j<0 || j>board[0].length-1) return false;
        char cur = word.charAt(ind);
        if (board[i][j]!=cur) return false;
        board[i][j]=' ';
        if (helper(board,word,i-1,j,ind+1)) return true;
        if (helper(board,word,i+1,j,ind+1)) return true;
        if (helper(board,word,i,j+1,ind+1)) return true;
        if (helper(board,word,i,j-1,ind+1)) return true;
        board[i][j]=cur;
        return false;
    }
}