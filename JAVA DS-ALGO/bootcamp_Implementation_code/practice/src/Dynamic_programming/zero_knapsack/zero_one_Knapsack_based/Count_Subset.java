package Dynamic_programming.zero_knapsack.zero_one_Knapsack_based;
public class Count_Subset {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,3};
        int target=3;
        int ans=subset_sum_count(arr,target);
        System.out.println(ans);
    }

    public static int subset_sum_count(int[] arr,int target) {
        int[][] dp = new int[arr.length + 1][target + 1];
        for (int i = 0; i <= arr.length; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j <= target; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                } else dp[i][j] = dp[i - 1][j];
            }


        }
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j]+"  ");

            }
            System.out.println();

        }
        return dp[arr.length][target];
    }

}
