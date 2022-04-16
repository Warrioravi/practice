import java.util.Scanner;

public class apowerb {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        int result=1;
        int count=1;
        while(count<=b){
            result*=a;
            count++;

        }
        System.out.println(result);
    }
}
