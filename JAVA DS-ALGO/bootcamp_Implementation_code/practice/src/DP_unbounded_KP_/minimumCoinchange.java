package DP_unbounded_KP_;

public class minimumCoinchange {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=5;
        int ans=mincoinchange(arr,target);
        System.out.println(ans);
    }
    public static int mincoinchange(int[] coins,int target){
        int dp[][]=new int[coins.length+1][target+1];
        for (int i = 0; i <= coins.length; i++) {
            dp[i][0]=1;
        }
        for (int j = 1; j <=target; j++) {
            dp[0][j]=Integer.MAX_VALUE;
        }
        for (int i = 1; i <=coins.length; i++) {
            for (int j = 1; j <=target; j++) {
                if (j>=coins[i-1]){
                    dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[coins.length][target];
    }
}
