package pattern;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces=2*n-3;
        for (int i = 1; i <=n ; i++) {
            int val=1;
          while(val<=i){
              System.out.print((val++)+"\t");
          }

            val--;
            for (int j = 1; j <=spaces ; j++) {
                System.out.print("\t");
            }val= i==n? val-1 : val;
            while(val>0){
            System.out.print(val-- +"\t");
            }
            spaces-=2;
            System.out.println();
        }

    }
}