package Dynamic_programming.zero_knapsack.zero_one_Knapsack_based;

import java.util.Arrays;

public class Knapsack {
    public static int[][] dp=new int[100][100];
    public static void main(String[] args) {
        int[] wt={1,2,3,5};
        int[] val={40,20,30,100};
        int capacity=7;
        for (int[] row:dp){
            Arrays.fill(row,-1);
        }
       int TDans=KP_TopDown(wt,val,capacity);
        int memoized_ans=KP_memoized(wt,val,capacity,wt.length);
        System.out.println("memoized approach:"+memoized_ans);
        System.out.println("Top-Down approach:"+TDans);
    }

    //####################################################################################################################################

    public static int KP_memoized(int[] wt,int[] val,int capacity,int current_cell) {
        if (current_cell == 0 || capacity == 0) {
            return 0;
        }
        if (dp[current_cell][capacity] != -1) {
            return dp[current_cell][capacity];
        }
        if (capacity >= wt[current_cell - 1]) {
            return dp[current_cell][capacity]=Math.max(val[current_cell-1]
                    +KP_memoized(wt,val,capacity-wt[current_cell-1],current_cell-1),KP_memoized(wt,val,capacity,current_cell-1));
        }
        else{
            return dp[current_cell][capacity]=KP_memoized(wt,val,capacity,current_cell-1);
        }
    }



    //######################################################################################################################################################





    public static int KP_TopDown(int[] wt,int[] val,int capacity){

        for (int i = 0; i <capacity+1 ; i++) {
            for (int j = 0; j <wt.length+1; j++) {
                if (i==0||j==0){
                    dp[i][j]=0;
                }
            }
            
        }
        for (int i = 1; i <=val.length ; i++) {
            for (int j=1;j<=capacity;j++){
                if (j>=wt[i-1]){
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }


        }
        return dp[val.length][capacity];

        
    }
}
