package arrays2D;

import java.util.Scanner;

public class matrixmultiplication {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int m1=s.nextInt();
        int[][] arr1=new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                arr1[i][j]=s.nextInt();
            }
        }
        int n2=s.nextInt();
        int m2=s.nextInt();
        int[][] arr2=new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr2[i][j]=s.nextInt();
            }
        }
        if(m1!=n2){
            System.out.println("Impossible");
            return;
        }
        int[][] product=new int[n1][m2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                int curr_product=0;
                for (int k = 0; k < m1; k++) {
                    curr_product+=(arr1[i][k]*arr2[k][j]);
                }
                product[i][j]=curr_product;
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }





    }

}
