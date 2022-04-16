package functiosAndNumberSystems;

import java.util.Scanner;

public class AnybaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2){
       int sum=0;
       int carry=0;
       int power=1;
       while(n1>0||n2>0){
           int d1=0,d2=0;
           if(n1>0){
               d1=n1%10;
           }
           if(n2>0){
               d2=n2%10;
           }
           int curr=d1+d2+carry;
           sum+=(curr%b)*power;
           carry=curr/b;
           n1=n1/10;
           n2=n2/10;
           power*=10;



       }
       if(carry!=0){
           sum+=(carry)*power;
       }
       return sum;
    }
}
