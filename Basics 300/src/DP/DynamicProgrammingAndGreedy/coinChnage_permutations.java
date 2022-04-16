package DP.DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class coinChnage_permutations {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=s.nextInt();
        }
        int amt=s.nextInt();
        int ans=find(coins,amt);
        System.out.println(ans);

    }
    public static int find(int[] coins,int amt){
        int[] dp=new int[amt+1];
        dp[0]=1;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<coins.length;j++){
                if(i-coins[j]>=0){
                    dp[i]+=dp[i-coins[j]];
                }
            }
        }
        return dp[amt];
    }
}
