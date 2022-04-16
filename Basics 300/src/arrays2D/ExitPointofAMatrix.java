package arrays2D;

import java.util.Scanner;

public class ExitPointofAMatrix {
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
        int i=0;
        int j=0;
        int direction=0;
        while (true){
            direction=(direction+arr[i][j])%4;
             if (direction==0){
                  j++;
             }
             else if(direction==1){
                  i++;
             }
             else if(direction==2){
                  j--;
             }
             else if(direction==3){
                  i--;
             }
             else{
                 /////
             }
             if(i<0){
                 i++;
                 break;
             }
             if(j<0){
                 j++;
                 break;
             }
             if(i==row){
                 i--;
                 break;
             }
             if(j==col){
                 j--;
                 break;
             }
        }
        System.out.println(i+" "+j);


    }
}
