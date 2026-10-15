class Solution {
    int maxsum=0;
    public int getMaximumGold(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    backtrack(i,j,0,grid);
                }
            }
        }
        return maxsum;
    }
    public void backtrack(int i,int j,int currsum,int[][] grid){
        int r=grid.length;
        int c=grid[0].length;
        if(i<0 || j<0 || i>=r || j>=c || grid[i][j]==0){
            maxsum=Math.max(maxsum,currsum);
            return;
        }
        int temp=grid[i][j];
        grid[i][j]=0;
        currsum+=temp;
        backtrack(i,j+1,currsum,grid);
        backtrack(i,j-1,currsum,grid);
        backtrack(i+1,j,currsum,grid);
        backtrack(i-1,j,currsum,grid);
        grid[i][j]=temp;
    }
}