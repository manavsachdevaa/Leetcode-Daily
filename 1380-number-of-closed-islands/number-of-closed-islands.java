class Solution {
    public boolean dfs(int[][] grid,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        if(i<0 || i>=m || j<0 || j>=n){
            return false;
        }
        if(grid[i][j]==1){
            return true;
        }
        grid[i][j]=1; //visited
        boolean left=dfs(grid,i,j-1);
        boolean right=dfs(grid,i,j+1);
        boolean up=dfs(grid,i-1,j);
        boolean down=dfs(grid,i+1,j);
        return left && right && up && down;


    }
    public int closedIsland(int[][] grid) {
        int ct=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0 && dfs(grid,i,j)==true){
                
                    ct++;
                
            }
            }
        }
        return ct;
    }
}