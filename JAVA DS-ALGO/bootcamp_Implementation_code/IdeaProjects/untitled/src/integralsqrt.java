import java.util.Scanner;
import java.lang.Math;


public class integralsqrt {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int input=s.nextInt();
        int result=intsqrt(input);
        System.out.println(result);
    }
    static int intsqrt(int x){
        double d=Math.sqrt(x);
        return((int)d);
    }
}
