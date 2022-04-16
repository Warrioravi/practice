package com.company;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input= s.nextInt();
        int cols=input;
        int row=1;
        while (row<=input){
            int col=1;
            //printing first half
            while (col<=cols){
                System.out.print((char)(64+col));
                col++;
            }
            col--;
            //printing second half
            while (col>0){
                System.out.print((char)(64+col));
                col--;
            }
            cols--;
             row++;
            System.out.println();

        }


    }
}
