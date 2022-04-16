package Dynamic_programming.zero_knapsack.zero_one_Knapsack_based;

public class ssubsets_wuth_givendifference {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(subswithgivendiff(arr,1));
    }
    public static int subswithgivendiff(int [] arr,int difference){
        //s2-s1=difference
        //s1+s2=sum of array
        //s1=sumofarray/2+difference/2
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int s1=(sum+difference)/2;
       return Count_Subset.subset_sum_count(arr,s1);
    }

}
