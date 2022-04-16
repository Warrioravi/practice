package arrays2D;

import java.util.Scanner;

public class RingRotate {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] mat=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j]=s.nextInt();
            }
        }
        int shell=s.nextInt();
        int r=s.nextInt();
        shellRotate(mat,shell,r);
        display(mat);

    }
    public static  void shellRotate(int[][] mat,int s,int r){
        //Step-1 fill 1D array using s-shell of matrix
        int[] arr=fill1DArray(mat,s);

        //Step-2 rotate this 1D array
         rotate(arr,r);

         //Step-3 fill s shell of matrix with this rotated array
         fill2DMatrix(mat,s,arr);

    }
     public  static  void fill2DMatrix(int[][] mat,int s,int[] arr){
         int row=mat.length;
         int col=mat[0].length;
         int row_start=s-1;
         int col_start=s-1;
         int row_end=row-s;
         int col_end=col-s;
         int total_elements=2*(row_end-row_start)+2*(col_end-col_start);
         int index=0;
         for (int i = row_start; i <=row_end ; i++) {
             mat[i][col_start]= arr[index];
             index++;
         }
         col_start++;
         for (int i = col_start; i <=col_end ; i++) {
             mat[row_end][i]= arr[index];
             index++;
         }
         row_end--;
         for (int i =row_end ; i >=row_start ; i--) {
             mat[i][col_end]= arr[index];
             index++;
         }
         col_end--;
         for (int i = col_end; i >=col_start ; i--) {
             mat[row_start][i]= arr[index];
             index++;
         }
         row_start++;

     }
    public static  int[] fill1DArray(int[][] mat,int s){
        int row=mat.length;
        int col=mat[0].length;
        int row_start=s-1;
        int col_start=s-1;
        int row_end=row-s;
        int col_end=col-s;
        int total_elements=2*(row_end-row_start)+2*(col_end-col_start);
        int[] arr=new int[total_elements];
        int index=0;
        for (int i = row_start; i <=row_end ; i++) {
            arr[index]= mat[i][col_start];
            index++;
        }
        col_start++;
        for (int i = col_start; i <=col_end ; i++) {
            arr[index]=mat[row_end][i];
            index++;
        }
        row_end--;
        for (int i =row_end ; i >=row_start ; i--) {
            arr[index]=mat[i][col_end];
            index++;
        }
        col_end--;
        for (int i = col_end; i >=col_start ; i--) {
            arr[index]=mat[row_start][i];
            index++;
        }
        row_start++;
      return  arr;



    }
    public static  void rotate(int[] arr,int r){
        int n=arr.length;
        r=r%n;
        r=r<0 ? r+n : r;

        reverse(arr,0,n-1);
        reverse(arr,0,r-1);
        reverse(arr, r,n-1);

    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
