public class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> res = new HashSet<String>();
        for (String s: words){
            if (searchone(board,s)) res.add(s);
        }
        return new ArrayList<String>(res);
    }
    public boolean searchone(char[][] board, String s){
        int m=board.length;
        int n = board[0].length;
        boolean[][] used = new boolean[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (board[i][j]==s.charAt(0)){
                    used[i][j]=true;
                    if (helper(board, s, i, j, 1,used)) return true;
                    used[i][j]=false;
                }
                
            }
        }
        return false;
    }
    public boolean helper(char[][] board, String s, int i, int j, int ind, boolean[][] used){
        if (ind == s.length()) return true;
        if (i>0){
            if (!used[i-1][j] && board[i-1][j]==s.charAt(ind)){
                used[i-1][j]=true;
                if (helper(board,s,i-1,j,ind+1, used)) return true;
                used[i-1][j]=false;
            }
        }
        
        if (i<board.length-1){
            if (!used[i+1][j] && board[i+1][j]==s.charAt(ind)){
                used[i+1][j]=true;
                if (helper(board,s,i+1,j,ind+1, used)) return true;
                used[i+1][j]=false;
            }
        }
        
        if (j>0){
            if (!used[i][j-1] && board[i][j-1]==s.charAt(ind)){
                used[i][j-1]=true;
                if (helper(board,s,i,j-1,ind+1, used)) return true;
                used[i][j-1]=false;
            }
        }
        
        if (j<board[0].length-1){
            if (!used[i][j+1] && board[i][j+1]==s.charAt(ind)){
                used[i][j+1]=true;
                if (helper(board,s,i,j+1,ind+1, used)) return true;
                used[i][j+1]=false;
            }
        }
        
        return false;
        
        
    }
}