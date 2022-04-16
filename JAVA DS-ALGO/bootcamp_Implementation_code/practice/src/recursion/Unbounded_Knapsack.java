package recursion;

public class Unbounded_Knapsack {
    public static void main(String[] args) {
        int[] val={10,40,50,70};
        int[] wt= {1, 3, 4, 5};

        System.out.println(Kp(wt,val,wt.length-1,8));
    }
    public static int Kp(int[] wt,int[] val,int curr,int capacity){
     if (capacity==0||curr==-1){
         return 0;
     }
     if (wt[curr]<=capacity){
         return Math.max(val[curr]+Kp(wt,val,curr,capacity-wt[curr]),Kp(wt,val,curr-1,capacity));
     }
     else{
         return Kp(wt,val,curr-1,capacity);
     }
    }

}