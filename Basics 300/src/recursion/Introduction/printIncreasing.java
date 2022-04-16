package recursion.Introduction;

import java.util.Scanner;

public class printIncreasing {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        print(n);

    }
    public static void print(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
