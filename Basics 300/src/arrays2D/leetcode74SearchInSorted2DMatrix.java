package arrays2D;

import java.util.Scanner;

public class leetcode74SearchInSorted2DMatrix {
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
    public static boolean search(int[][]matrix,int target) {
        int low=0;
        int row=matrix.length;
        int col=matrix[0].length;
        int high=row*col-1;
        while(low<=high){
            int mid=(low+high)/2;
            int midValue=matrix[mid/col][mid%col];
            if(midValue==target){
                return true;
            }
            else if(midValue<mid){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}
