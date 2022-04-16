package arrays2D;

import java.util.Scanner;

public class spiral_Anticlockwise {
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
        int total_elements=row*col;
        int top=0;
        int left=0;
        int right=col-1;
        int bottom=row-1;
        int direction=1;
        while(total_elements>0){
            if(total_elements>0&&direction==1){
                for(int i=top;i<=bottom;i++){
                    System.out.println(arr[i][left]);
                    total_elements--;
                }
                left++;
                direction=2;

            }
            if(total_elements>0&&direction==2){
                for (int i = left; i <=right ; i++) {
                    System.out.println(arr[bottom][i]);
                    total_elements--;
                }
                bottom--;
                direction=3;

            }
            if(total_elements>0&&direction==3){
                for (int i = bottom; i >=top ; i--) {
                    System.out.println(arr[i][right]);
                    total_elements--;
                }
                  right--;
                 direction=4;
            }
            if(total_elements>0&&direction==4){
                for (int i = right; i >=left ; i--) {
                    System.out.println(arr[top][i]);
                    total_elements--;
                }
                  top++;
                  direction=1;
            }
        }
    }
}
