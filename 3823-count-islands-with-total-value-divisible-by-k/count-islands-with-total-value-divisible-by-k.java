class Solution {
    public long dfs(int[][] grid,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0){
            return 0;
        }
        int val=grid[i][j];
        grid[i][j]=0;
        long sum=val;
        sum=sum+dfs(grid,i,j-1);
        sum=sum+dfs(grid,i,j+1);
        sum=sum+dfs(grid,i-1,j);
        sum=sum+dfs(grid,i+1,j);
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int ct=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    long sum=dfs(grid,i,j);
                    if(sum%k==0){
                        ct++;
                    }
                }
            }
        }
        return ct;
    }
}