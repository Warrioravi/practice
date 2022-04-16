package pattern;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int mid=n/2+1;
        for (int row = 1;row <= n; row++) {
            int spaces=0,stars=0;

            if (row<=mid){
                spaces=n/2-row+1;
                stars=2*row-1;
                for (int i = 0; i < spaces; i++) {
                    System.out.print("\t");
                }
                for (int i = 0; i < stars; i++) {
                    System.out.print("*"+"\t");
                }
            }
            else{
                spaces=row-mid;
                stars=(n-row+1)*2-1;
                for (int i = 0; i < spaces; i++) {
                    System.out.print("\t");
                }
                for (int i = 0; i < stars; i++) {
                    System.out.print("*"+"\t");
                }

            }
            System.out.println();
        }
    }
}
