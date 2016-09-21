public class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[i].length; j++){
                if (grid[i][j] == '1'){
                    res++;
                    helper(grid,i,j);
                }
            }
        }
        return res;
    }
    public void helper(char[][] grid, int i, int j){
        if (i<0 || i>=grid.length || j<0 || j>=grid[i].length) return;
        if (grid[i][j]=='0') return;
        grid[i][j]= '0';
        helper(grid,i-1,j);
        helper(grid,i+1,j);
        helper(grid,i,j-1);
        helper(grid,i,j+1);
    }
}