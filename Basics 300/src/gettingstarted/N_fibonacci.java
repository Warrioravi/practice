package gettingstarted;

import java.util.Scanner;

public class N_fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        int first=0;
        int second=1;
        while(count++<n){
            System.out.println(first);
            int temp=second;
            second=second+first;
            first=temp;

        }
    }
}
