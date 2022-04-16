package Dynamic_programming.zero_knapsack.zero_one_Knapsack_based;

public class Equal_sum_partition {
    public static void main(String[] args) {
        int[] arr={6,7,8,9,6};
        int sum=0;
        for (int i:arr) {
            sum+=i;
        }
        if (sum%2==1){
            System.out.println("impossible");
        }
        else{
            boolean ans=Subset_sum.Subsetsum(arr,sum/2);
            System.out.println(ans);
        }
    }

}
