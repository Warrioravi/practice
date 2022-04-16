import java.util.Scanner;

public class lowertoupper {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char input=s.next().charAt(0);
        if(input>=65&&input<=90){
            System.out.println("lowercase");

        }
        else if (input>=97&&input<=122){
            System.out.println("uppercase");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
