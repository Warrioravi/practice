package arrays2D;

import java.util.Scanner;

public class SaddlePrice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] arr=new int[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println(saddlepoint(arr));

    }
    public static String saddlepoint(int[][] arr){
        for (int row = 0; row <arr.length ; row++) {
            int minIndex=getRowMin(arr[row]);
            if(getColMax(arr,minIndex)==arr[row][minIndex]){
                return arr[row][minIndex]+"";
            }
        }






        return "Invalid input";
    }
    public static int getRowMin(int[] arr){
        int min=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;
    }
    public static int getColMax(int[][] arr,int col){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i][col]>max){
            max=arr[i][col];
            }
        }
        return max;
    }

}
