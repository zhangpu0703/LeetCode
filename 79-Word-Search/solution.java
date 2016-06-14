public class Solution {
    public boolean exist(char[][] board, String word) {
        if (word.length()==0) return true;
        int m = board.length;
        if (m==0) return false;
        int n = board[0].length;
        boolean[][] used = new boolean[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (board[i][j] == word.charAt(0)){
                    used[i][j]=true;
                    if (helper(board,word,i,j,1,used)) return true;
                    used[i][j]=false;
                }
            }
        }
        return false;
    }
    
    public boolean helper(char[][] board, String word, int i, int j, int ind, boolean[][] used){
        if (ind == word.length()) return true;
        if (i>0){
            if (!used[i-1][j] && word.charAt(ind)==board[i-1][j]){
                used[i-1][j]=true;
                if (helper(board,word,i-1,j,ind+1,used)) return true;
                used[i-1][j]=false;
            }
        }
        
        if (i<board.length-1){
            if (!used[i+1][j] && word.charAt(ind)==board[i+1][j]){
                used[i+1][j]=true;
                if (helper(board,word,i+1,j,ind+1,used)) return true;
                used[i+1][j]=false;
            }
        }
        
        if (j>0){
            if (!used[i][j-1] && word.charAt(ind)==board[i][j-1]){
                used[i][j-1]=true;
                if (helper(board,word,i,j-1,ind+1,used)) return true;
                used[i][j-1]=false;
            }
        }
        
        if (j<board[0].length-1){
            if (!used[i][j+1] && word.charAt(ind)==board[i][j+1]){
                used[i][j+1]=true;
                if (helper(board,word,i,j+1,ind+1,used)) return true;
                used[i][j+1]=false;
            }
        }
        
        return false;
    }
}