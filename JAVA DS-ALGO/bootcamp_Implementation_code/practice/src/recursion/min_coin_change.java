package recursion;

public class min_coin_change {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(minCoin(arr,10,arr.length));
    }
    public static int minCoin(int[] arr,int target,int curr_cell){
        if (target==0){
            return 1;
        }
        if (curr_cell==0){
            return Integer.MAX_VALUE;
        }
        if (arr[curr_cell]<=target){
            return Math.min(curr_cell,target);

        }
        int anything =Integer.MIN_VALUE;
        return anything;
    }
}
