package arrays2D;

import java.util.Scanner;

public class leetcode_240SearchInSorted2Dmatrix_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int[][] arr=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        int target=s.nextInt();
        System.out.println(search(arr,target));

    }
    public static  boolean search(int[][] matrix,int target){
        int midRow=0;
        int midCol=matrix[0].length-1;
        while(midRow<matrix.length&&midCol>=0){
            int currMid=matrix[midRow][midCol];
            if(currMid==target){
                return true;
            }
            if(target<currMid){
                midCol--;
            }
            else{
                midRow++;
            }
        }
        return  false;
    }
}
