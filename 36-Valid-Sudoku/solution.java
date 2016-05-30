public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i=0; i<9; i++){
            HashSet<Character> set = new HashSet<>();
            for (int j=0; j<9; j++){
                if (board[i][j]!='.'){
                    if (set.contains(board[i][j])) return false;
                    else set.add(board[i][j]);
                }
            }
        }
        
        for (int i=0; i<9; i++){
            HashSet<Character> set = new HashSet<>();
            for (int j=0; j<9; j++){
                if (board[j][i]!='.'){
                    if (set.contains(board[j][i])) return false;
                    else set.add(board[j][i]);
                }
            }
        }
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                HashSet<Character> set = new HashSet<>();
                for (int row = i*3; row<=i*3+2; row++){
                    for (int col = j*3; col <= j*3+2; col++){
                        if (board[row][col]!='.'){
                            if (set.contains(board[row][col])) return false;
                            else set.add(board[row][col]);
                        }
                    }
                }
            }
        }
        return true;
    }
}