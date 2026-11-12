class Solution {
    public int solve(int i,int n,int[] costs,int[] dp){
        if(i==n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int cost=Integer.MAX_VALUE;
        for(int j=1;j<=3;j++){
            int next=i+j;
            if(next<=n){
                int currcost=costs[next-1] + j*j + solve(next,n,costs,dp); 
                cost=Math.min(cost,currcost);
            }
            dp[i]=cost;
        }
        return dp[i];
    }
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=solve(0,n,costs,dp);
        return ans;
    }
}