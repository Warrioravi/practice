package pattern;

import java.util.Scanner;

public class pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int row=1;row<=n;row++){
            int spaces=n-row;
            for(int i=0;i<spaces;i++){
                System.out.print("\t");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }



    }
}
