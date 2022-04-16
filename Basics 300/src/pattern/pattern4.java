package pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int row = 0;row < n; row++) {
            for (int spaces = 1; spaces <=row ; spaces++) {
                System.out.print("\t");
            }
            for (int col = 1; col <=n-row; col++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
