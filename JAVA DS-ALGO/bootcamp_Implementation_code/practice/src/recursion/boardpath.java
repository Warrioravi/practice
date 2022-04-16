package recursion;

import java.util.Arrays;

public class boardpath {

    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=0;
            }

        }
        boardpath_backtracaking(arr,0,0,arr.length-1,arr.length-1);
    }
    public static void boardpath_backtracaking(int[][] arr,int curr_row,int curr_col,int end_row,int end_col){
        if (curr_col>end_col||curr_row>end_row){
            return;
        }
        if (curr_col==end_col&&curr_row==end_row){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[i][j]+"  ");
                }
                System.out.println();
            }
            return;
        }
        arr[curr_row][curr_row]=1;
        boardpath_backtracaking(arr,curr_row+1,curr_col,end_row,end_col);


        boardpath_backtracaking(arr,curr_row,curr_col+1,end_row,end_col);

    }

}
