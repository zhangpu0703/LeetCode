public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] used = new boolean[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (search(board,used,word,i,j,0)) return true;
            }
        }
        return false;
    }
    public boolean search(char[][] board, boolean[][] used, String word, int i, int j, int cur){
        
        if (cur == word.length()) return true;
        if (i<0 || i>=board.length || j<0 || j>=board[0].length) return false;
        if (word.charAt(cur)!=board[i][j]) return false;
        if (!used[i][j]){
            used[i][j]=true;
            if (search(board,used,word,i-1,j,cur+1)) return true;
            if (search(board,used,word,i+1,j,cur+1)) return true;
            if (search(board,used,word,i,j-1,cur+1)) return true;
            if (search(board,used,word,i,j+1,cur+1)) return true;
            used[i][j]=false;
            return false;
        }
        else return false;
    }
}