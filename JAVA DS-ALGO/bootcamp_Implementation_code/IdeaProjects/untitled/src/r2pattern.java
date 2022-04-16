import java.util.Scanner;

public class r2pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input=s.nextInt(),n1,n2;
        n1=n2=input;
        int start;
        //checking starting number
        if (input%2==0){
            start=input-1;
        }
        else{
            start=input;
        }
        //printing odd series
        while(start>=1) {
            System.out.println(start);
            start -= 2;
        }
        start=2;
        while (start<=input){
            System.out.println(start);
            start+=2;
        }
    }
}
