package DP.DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class unboundedKnapsack {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int  $A12b=0;
        int n=s.nextInt();
        int[] weight=new int[n];
        int[] values=new int[n];

        for(int i=0;i<n;i++){
            values[i]=s.nextInt();
        }

        for(int i=0;i<n;i++){
            weight[i]=s.nextInt();
        }
        int capacity=s.nextInt();
        int ans=knapsack(weight,values,n,capacity);
        System.out.println(ans);

    }
    public static  int knapsack(int[] weight,int[] values,int n,int capacity){

        int[][] dp=new int[weight.length+1][capacity+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i==0||j==0){
                    dp[i][j]=0;

                }
                else{
                    if(weight[i-1]<=j){
                        dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+values[i-1]);
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }

            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
