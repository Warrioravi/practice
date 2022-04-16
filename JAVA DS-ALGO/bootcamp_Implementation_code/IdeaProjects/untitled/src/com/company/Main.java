package com.company;

import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        int testcases;
        int decimal;
        long binary=0;
        int count;




        Scanner s = new Scanner(System.in);
        testcases = s.nextInt();
        for (int i = 0; i < testcases; i++) {
            binary = s.nextInt();
            count=0;
            decimal=0;
            while (binary>0) {
                if (binary % 10 == 1) {
                    decimal += Math.pow(2, count);
                    count++;
                    binary=binary/10;
                }
                else {
                    count++;
                    binary = binary / 10;
                }
            }
            System.out.println(decimal);
        }


    }
}
