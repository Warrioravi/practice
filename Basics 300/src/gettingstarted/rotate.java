package gettingstarted;

import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int k=s.nextInt();
        int no_of_digits=count(num);
        k=k%no_of_digits;
        if (k<0){
            k=no_of_digits+k;
        }

        int divisor=(int)Math.pow(10,k);
        int rem=num%divisor;
        int quotient=num/divisor;
        int multiplier=(int)Math.pow(10,no_of_digits-k);
        rem=rem*multiplier;
        int rotated=rem+quotient;
        System.out.println(rotated);







    }
    public static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return  count;
    }
}
