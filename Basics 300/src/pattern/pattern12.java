package pattern;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //fibonacci series
        // write ur code here
        int row=scn.nextInt();
        int curr_row=1;
        int first=0;
        int second=1;
        while(curr_row<=row){
            int count=curr_row;
            while(count-->0){
                System.out.print(first+"	");
                int temp=second;
                second=second+first;
                first=temp;
            }
            System.out.println();
            curr_row++;



        }


    }

}

