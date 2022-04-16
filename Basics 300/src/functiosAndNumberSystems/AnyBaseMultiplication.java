package functiosAndNumberSystems;

import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }
    public static int getProduct(int b, int n1, int n2){
        int ans=0;
        int power=1;
        while(n2>0){
            int curr_digit=n2%10;
            int curr_product=multiply(n1,curr_digit,b)*power;
            ans=getSum(b,ans,curr_product);

            power*=10;
            n2=n2/10;

        }
        return  ans;
    }
    public static int multiply(int n1,int digit,int base) {
        int rv = 0;
        int carry = 0;
        int power = 1;
        while (n1 > 0 || carry > 0) {
            int curr = n1 % 10;
            n1 = n1 / 10;

            int product = curr * digit + carry;

            rv += (product % base) * power;
            carry = product / base;

            power *= 10;
        }
        return rv;
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
