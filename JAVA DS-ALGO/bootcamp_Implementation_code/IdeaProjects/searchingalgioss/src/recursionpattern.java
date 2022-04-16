import java.io.*;
import java.util.Scanner;
class recursion
{


    static void printn(int num)
    {
        if (num == 0)
            return;
        System.out.print ("*"+"\t");
        printn(num - 1);
    }


    static void pattern(int n)
    {
        if (n == 0)
            return;
        printn(n);
        System.out.println();
        pattern(n - 1);
    }


    public static void main (String[] args)
    {
        Scanner s= new Scanner(System.in);
        int input=s.nextInt() ;
        pattern(input);
    }
}


