class Solution {
    public int climb(int n,int[] dp){
        if(n<=3){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=climb(n-1,dp) + climb(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        //Tabulation --> Bottom - up (iterative)
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        // if(n<=3){
        //     return n;
        // }
        // dp[0]=0;
        // dp[1]=1;
        // dp[2]=2;
        // dp[3]=3;
        // for(int i=4;i<=n;i++){
        //     dp[i]=dp[i-2]+dp[i-1];
        // }
        //Memoization --> recursive --> top down
        int ans=climb(n,dp);
        return ans;
    }
}