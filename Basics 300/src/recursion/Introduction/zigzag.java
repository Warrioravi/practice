package recursion.Introduction;

import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        zigZag(n);
    }
    public  static void zigZag(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        zigZag(n-1);
        System.out.println(n);
        zigZag(n-1);
        System.out.println(n);
    }
}
