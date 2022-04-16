package pattern;


import java.util.Scanner;

public class patern18 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i+j==n+1||i==1||i==j||i==n||(i+j >= n+1&&j<=i)){
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
