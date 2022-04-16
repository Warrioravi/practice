package DP_unbounded_KP_;

import java.util.Scanner;

public class coin_change_problem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0) {
            int n = s.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=s.nextInt();
            }
            int target = s.nextInt();
            int ans = coinchange(arr, target);
            System.out.println(ans);
        }
    }
    public static int coinchange(int[] coins,int target){
        int dp[][]=new int[coins.length+1][target+1];
        for (int i = 0; i <= coins.length; i++) {
            dp[i][0]=1;
        }
        for (int j = 1; j <=target; j++) {
            dp[0][j]=0;
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
