package arrays;

import java.util.Scanner;

public class MaxSubarray {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            int[] ar = new int[]{-6,-3,8,-1,-2,1,5,-3};
//            for (int i = 0; i < n; i++) {
//                ar[i] = s.nextInt();
//            }
            System.out.println(kadanes(ar));
    }
    // kadanes algo
    public static int kadanes(int[] arr){
        int maxtillhere=arr[0];
        int maxOverall=arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxtillhere=Math.max(arr[i],maxtillhere+arr[i]);
            maxOverall=Math.max(maxOverall,maxtillhere);
        }
        return  maxOverall;
    }
}
