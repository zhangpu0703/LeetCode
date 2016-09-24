public class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        if (grid == null || grid.length == 0) return res;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[i].length; j++){
                if (grid[i][j] == '1' && !visited[i][j]){
                    res++;
                    helper(grid,i,j,visited);
                }
            }
        }
        return res;
    }
    public void helper(char[][] grid, int i, int j, boolean[][] visited){
        if (i<0 || i>=grid.length || j<0 || j>=grid[i].length) return;
        if (grid[i][j]=='0' || visited[i][j]) return;
        visited[i][j] = true;
        helper(grid,i-1,j,visited);
        helper(grid,i+1,j,visited);
        helper(grid,i,j-1,visited);
        helper(grid,i,j+1,visited);
    }
}