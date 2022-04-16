package pattern;

import java.util.Scanner;

public class pattern7and8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("\t");
            }
            System.out.print("*");
            System.out.println();
        }

    }
}
