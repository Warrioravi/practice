package DP.DynamicProgrammingAndGreedy;

public class ClimbStairs_Variable {
    public static void main(String[] args) {
        int n=10;
        int[] jumps=new int[]{3,3,0,2,1,2,4,2,0,0};
        System.out.println(ways(n,jumps));

    }
    public static  int ways(int n,int[] jumps){
        int[] dp=new int[n+1];
        dp[n]=1;
        for (int i = n-1; i >=0 ; i--) {
            int jump=jumps[i];
            for (int j = 1; j <=jump ; j++) {
                if(i+j<=n){
                    dp[i]+=dp[i+j];
                }

            }
        }
        return dp[0];

    }
}
