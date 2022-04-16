package DP.DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class Min_cost_Maze {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] maze=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j]=s.nextInt();
            }
        }
        System.out.println(findmin(maze,m,n));
    }
    public static  int findmin(int[][] arr,int row,int col)
    {
        int dp[][]=new int[row][col];
        for (int i = row-1; i >=0 ; i--) {
            for (int j = col-1; j >=0 ; j--) {
                if(i==row-1&&j==col-1){
                    dp[i][j]=arr[i][j];
                }
                else if(i==row-1){
                    dp[i][j]=dp[i][j+1]+arr[i][j];
                }
                else if(j==col-1){
                   dp[i][j]=dp[i+1][j]+arr[i][j];
                }
                else{
                    dp[i][j]=Math.min(dp[i][j+1],dp[i+1][j])+arr[i][j];
                }

            }

        }

        return dp[0][0];
    }


}
