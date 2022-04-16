package Dynamic_programming.zero_knapsack.zero_one_Knapsack_based;

import java.util.Arrays;

public class Subset_sum {
    public static void main(String[] args) {
        int[] arr={4,2,3,4,5};
        boolean ans=Subsetsum(arr,18);
        System.out.println(ans);
    }





    public static boolean Subsetsum(int[] arr,int target){

        int sum=0;
        for (int i:arr) {
            sum+=i;
        }
        if (sum%2==1){
            return false;
        }
        boolean[][] dp=new boolean[arr.length+1][target+1];
        for (boolean[] array:dp) {
            Arrays.fill(array,false);
        }
        for (int i = 0; i <=arr.length ; i++) {
            dp[i][0]=true;
        }
        for (int j = 1; j <=target ; j++) {
            dp[0][j]=false;
        }
        for (int i = 1; i <=arr.length ; i++) {
            for (int j = 1; j <=target ; j++) {
                if (j>=arr[i-1]){
                    dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }

        }
        return dp[arr.length][target];
    }
}
