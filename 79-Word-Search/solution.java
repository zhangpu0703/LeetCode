public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        if (m==0) return false;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (helper(board,word,visited,0,i,j)) return true;
            }
        }
        return false;
    }
    public boolean helper(char[][] board, String word, boolean[][] visited, int ind, int i, int j){
        if (ind == word.length()) return true;
        int m = board.length, n = board[0].length;
        if (i<0 || i>=m || j<0 || j>=n) return false;
        if (visited[i][j]) return false;
        if (board[i][j]!=word.charAt(ind)) return false;
        visited[i][j]=true;
        if(helper(board,word,visited,ind+1,i-1,j)) return true; 
        if(helper(board,word,visited,ind+1,i,j-1)) return true; 
        if(helper(board,word,visited,ind+1,i+1,j)) return true; 
        if(helper(board,word,visited,ind+1,i,j+1)) return true;
        visited[i][j]=false;
        return false;
    }
}