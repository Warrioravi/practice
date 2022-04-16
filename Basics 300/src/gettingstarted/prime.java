package gettingstarted;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();

            if(isPrime(n)){
                System.out.println("prime");
            }
            else System.out.println("not prime");
        }
    }
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        int factors=0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
