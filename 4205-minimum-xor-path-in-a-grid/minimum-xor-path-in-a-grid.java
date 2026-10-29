class Solution {
    int min=Integer.MAX_VALUE;
    boolean[][][] dp;
    public int minCost(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        dp=new boolean[m][n][1024];
        backtrack(grid,0,0,0);
        return min;
    }
    public void backtrack(int[][] grid,int i,int j,int curr){
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
            return;
        }
    
        backtrack(grid,i,j+1,curr);
        backtrack(grid,i+1,j,curr);
    }
}