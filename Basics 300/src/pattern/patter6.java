package pattern;

import java.util.Scanner;

public class patter6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int stars=n/2+1;
        int spaces=1;
        for (int i = 1; i <=n/2 ; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print("*"+"\t");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print("\t");

            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*"+"\t");
            }
            spaces+=2;
            stars-=1;
            System.out.println();
        }
        stars=1;
        spaces=n;
        for (int i = 1; i <=n/2+1 ; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print("*"+"\t");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print("\t");

            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*"+"\t");
            }
            spaces-=2;
            stars+=1;
            System.out.println();
        }

    }
}
