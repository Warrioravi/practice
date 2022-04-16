package DP.DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class Target_Sum_Subset {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        boolean ans=find(arr,target);
        System.out.println(ans);
    }
    public static boolean find(int[] arr,int target){
        boolean[][] dp=new boolean[arr.length+1][target+1];
        //filling last row
        for(int i=0;i<arr.length+1;i++){
            for(int j=0;j<target+1;j++){
                if(j==0){
                    dp[i][j]=false;
                }
                if(i==0){
                    dp[i][j]=true;
                }
                else{
                    //inclusion
                    if(j-arr[i-1]>=0){
                        dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
                    }
                    //exclusion
                    else{
                        dp[i][j]=dp[i-1][j];
                    }

                }

            }
        }
        return dp[arr.length][target];
    }
}
