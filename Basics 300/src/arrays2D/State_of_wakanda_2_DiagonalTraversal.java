package arrays2D;

import java.util.Scanner;

public class State_of_wakanda_2_DiagonalTraversal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] arr=new int[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        diagonal(arr);
    }
    public static void diagonal(int[][] arr){
        for (int col = 0; col < arr[1].length; col++) {

            int i=0;
            int j=col;
            while(i<arr.length&&j<arr[1].length){
                System.out.println(arr[i++][j++]);
            }
        }
    }
}
