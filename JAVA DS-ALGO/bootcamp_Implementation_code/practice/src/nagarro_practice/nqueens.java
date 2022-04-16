package nagarro_practice;

import java.util.Arrays;

public class nqueens {
    public static void main(String[] args) {
        int[][] arr=new int[4][4];
        for(int[]array:arr){
            Arrays.fill(array,0);
        }
        System.out.println(Nqueens(arr,0));


    }
    public static int Nqueens(int[][] board,int row){
        if (row==board.length){
            display(board);
             return 1;
        }
        int count=0;
        for (int col=0;col<board[0].length;col++){
            if (isSafe(board,row,col)){
                board[row][col]=1;
                count+=Nqueens(board,row+1);
                board[row][col]=0;
            }
        }
        return  count;

    }
     public static boolean isSafe(int arr[][],int row,int col){
        for (int i=row;i>=0;i--){
            if (arr[i][col]==1){
                return  false;
            }
        }
         for (int i =row,j=col;j>=0&&i>=0; i--,j--) {
             if (arr[i][j]==1){
                 return  false;
             }
         }
         for (int i =row,j=col;j<arr[0].length &&i>=0; i--,j++) {

             if (arr[i][j]==1){
                 return  false;
             }

         }

      return  true;
     }

     public static void  display(int[][] arr){
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
         }




     }
}
