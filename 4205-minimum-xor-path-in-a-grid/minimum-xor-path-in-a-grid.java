class Solution {
    int min=Integer.MAX_VALUE;
    
    public int minCost(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        boolean[][][] dp=new boolean[m][n][1024];
        backtrack(grid,0,0,0,dp);
        return min;
    }
    public void backtrack(int[][] grid,int i,int j,int curr,boolean[][][] dp){
        int m=grid.length;
        int n=grid[0].length;
        if(i>=m || j>=n){
            return;
        }
        int val=grid[i][j];
        curr=curr^val;
        if(dp[i][j][curr]){
            return;
        }
        dp[i][j][curr]=true;
        if(i==m-1 && j==n-1){
            min=Math.min(min,curr);
        }
        backtrack(grid,i,j+1,curr,dp);
        backtrack(grid,i+1,j,curr,dp);
    }
}