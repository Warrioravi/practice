package pattern;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int mid=(n+1)/2;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                if(row==mid||col==mid|| ((row==1)&&(col<mid))||((row==n)&&(col>mid))||(col==1&&row>mid)||(col==n&&row<mid)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}
