package recursion.Introduction;

import java.util.Scanner;

public class powerLogarithmic {
    public static void main(String[] args) throws Exception {
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int n=s.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if (n==0){
            return 1;
        }
        int curr=power(x,n/2);
        return n%2==0? curr*curr :x*curr*curr;
    }
}
