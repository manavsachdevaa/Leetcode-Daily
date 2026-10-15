class Solution {
    int maxsum=0;
    public int getMaximumGold(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    solve(i,j,grid,0);
                }
            }
        }
        return maxsum;
    }
    public void solve(int i,int j,int[][] grid,int currsum){
        int r=grid.length;
        int c=grid[0].length;
        if(i<0 || i>=r || j<0 || j>=c || grid[i][j]==0){
            maxsum=Math.max(maxsum,currsum);
            return;
        }
        int temp=grid[i][j];
        grid[i][j]=0;
        currsum+=temp;
        solve(i,j+1,grid,currsum);
        solve(i,j-1,grid,currsum);
        solve(i-1,j,grid,currsum);
        solve(i+1,j,grid,currsum);
        grid[i][j]=temp;

    }
}