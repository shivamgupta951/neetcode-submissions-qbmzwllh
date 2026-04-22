class Solution {
    public static int solve(int[] cost , int n , int[] dp)
    {
        if(n==0) return cost[0];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int step1 = cost[n] + solve(cost,n-1,dp);
        int step2 = cost[n] + solve(cost,n-2,dp);
        return dp[n] = Math.min(step1,step2);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        int step1 = solve(cost,cost.length-1,dp);
        int step2 = solve(cost,cost.length-2,dp);
        return Math.min(step1,step2);
    }
}
