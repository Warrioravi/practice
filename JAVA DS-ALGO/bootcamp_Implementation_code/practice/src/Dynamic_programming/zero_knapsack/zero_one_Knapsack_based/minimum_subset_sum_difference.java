package Dynamic_programming.zero_knapsack.zero_one_Knapsack_based;

import java.util.Vector;

//we have to minimize s2-s1 ->>  min
//also s2=sum-s1;//s1-->>smaller ///s2-->> greater
// so we have to minimize   sum-s1-s1 --->>minimize
// sum-2*s1-->min
public class minimum_subset_sum_difference {
    public static void main(String[] args) {
        int[] arr={10,6,5,11};
        System.out.println(minsunsetsumdiff(arr));
    }
    public static int minsunsetsumdiff(int arr[]){
        int higher_limit=0;
        for (int i = 0; i < arr.length; i++) {
            higher_limit+=arr[i];
        }
        boolean dp[][]=new boolean[arr.length+1][higher_limit+1];
        for (int i = 0; i <=arr.length ; i++) {
            dp[i][0]=true;
        }
        for (int j = 1; j <=higher_limit ; j++) {
            dp[0][j]=false;
        }
        for (int i = 1; i <=arr.length ; i++) {
            for (int j = 1; j <=higher_limit ; j++) {
                if (arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }

            }

        }
        Vector<Integer> s1=new Vector<>();
        for (int j = 0; j<=higher_limit/2 ; j++) {
            if (dp[arr.length][j]==true){
                s1.add(j);
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i:s1) {
            min=Math.min(min,higher_limit-2*i);

        }
        return min;
    }



}
