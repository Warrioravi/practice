package pattern;

import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int mid=(n+1)/2;
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n ; col++) {
                if(col==1||col==n||(row>=mid&&row+col==n+1)||(row==col&&row>=mid)){
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
