package DP.DynamicProgrammingAndGreedy;

public class ClimbStairs {
    public static void main(String[] args) {

    }
    public static int ways(int n){
       int[] dp=new int[n+1];
       dp[n]=1;
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 1; j <=3 ; j++) {
                if(i+j<=n){
                    dp[i]+=dp[i+j];
                }
            }

        }
        return dp[0];

    }
}
