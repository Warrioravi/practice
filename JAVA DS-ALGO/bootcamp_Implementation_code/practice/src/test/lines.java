package test;

import java.util.*;
public class lines {
    public static void main (String args[]) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
    }
      //System.out.println(check(arr,0,arr.length-1));
        int[][] dp=new int[arr.length][arr.length];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                dp[i][j]=Math.min(arr[i],arr[j])*(j-i);
            }
        }
        System.out.println(maxi(dp));
}
    public static int maxi(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }

            }

        }
        return max;
    }
    public static int check(int[] arr,int beg,int end){
        if(beg==end){
            return 0;
        }

        int curr=Math.min(arr[beg],arr[end])*(beg-end);
        int next=check(arr,beg+1,end);
        return Math.max(curr,next);
    }
}