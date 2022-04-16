package com.company;

import java.util.Scanner;

public class fctorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int fac=fact(input);
        System.out.println(fac);
    }
    public static int fact(int x){
        int fact=1;
        while(x>=1){
            fact=fact*x;
            x--;
        }
        return fact;
    }
}
