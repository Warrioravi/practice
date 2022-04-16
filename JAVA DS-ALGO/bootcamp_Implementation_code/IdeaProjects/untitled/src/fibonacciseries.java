import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int input=s.nextInt();
        int first=0,second=1,next=first+second;
        System.out.println(first);
        System.out.println(second);
        while(next<=input){
            System.out.println(next);
            first=second;
            second=next;
            next=first+second;
        }
    }
}
