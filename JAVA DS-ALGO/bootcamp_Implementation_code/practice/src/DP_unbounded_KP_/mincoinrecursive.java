package DP_unbounded_KP_;

public class mincoinrecursive {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,5};
        int target=14;
        int ans=mincoinchange(arr,arr.length,target);
        System.out.println(ans);
    }
    public static int mincoinchange(int[] coins,int current_cell,int target){
        if (current_cell==0){
            return Integer.MAX_VALUE-1;
        }
        if (target==0){
            return 0;
        }
        if (coins[current_cell-1]<=target) {
            return Math.min(1 + mincoinchange(coins, current_cell, target - coins[current_cell - 1]), mincoinchange(coins,current_cell-1,target));
        }
        return mincoinchange(coins,current_cell-1,target);
    }
}
