import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int first=0,second=1,input,next=0;
        input=s.nextInt();
        System.out.println(first);
        System.out.println(second);

        while(next<=input){
            next=first+second;

            System.out.println(next);
            first=second;
            second=next;

        }
    }
}
