package ArrayList_StringBuilder;

import java.util.Scanner;

public class permutationsofaString {
    public static void solution(String str){
        int n=str.length();
        int factorial=1;
        for (int i = 1; i <=n; i++) {
            factorial=factorial*i;
        }
        for(int i=0;i<factorial;i++){
            StringBuilder sb=new StringBuilder(str);
            int dividend=i;


            for(int divisor=n;divisor>0;divisor--){
                int rem=dividend%divisor;
                int quotient=dividend/divisor;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                dividend=quotient;
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}

