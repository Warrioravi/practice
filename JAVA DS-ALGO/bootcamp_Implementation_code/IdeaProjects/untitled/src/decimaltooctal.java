import java.util.Scanner;

public class decimaltooctal {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int input=s.nextInt();
        int octal=0;
        while(input>0)
        {
            int rem=input%8;
            octal=octal*10+rem;
            input=input/8;
        }
        //reversing it
        int rev=0;
        while(octal>0)
        {
            int rem=octal%10;
            rev=rev*10+rem;
            octal=octal/8;
        }



        System.out.println(rev);
    }
}
