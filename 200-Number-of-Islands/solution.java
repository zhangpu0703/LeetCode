public class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if (m==0) return 0;
        int n = grid[0].length;
        int res =0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j]=='1'){
                    res++;
                    update(grid,i,j);
                }
            }
        }
        return res;
    }
    public void update(char[][] grid, int i, int j){
        if (i<0||i>=grid.length || j<0 || j>=grid[0].length) return;
        if (grid[i][j]=='0') return;
        grid[i][j]='0';
        update(grid,i-1,j);
        update(grid,i+1,j);
        update(grid,i,j-1);
        update(grid,i,j+1);
    }
}