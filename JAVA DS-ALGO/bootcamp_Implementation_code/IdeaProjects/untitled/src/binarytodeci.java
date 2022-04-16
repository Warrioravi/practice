import java.util.Scanner;
import java.lang.Math;
public class binarytodeci {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        long input=s.nextLong();
        int rem,dec=0,power=0;
        while (input>0){
            rem=(int)input%10;
            if (rem==1){
              dec+=Math.pow(2,power);
            }
            power++;
            input=input/10;

        }
        System.out.println(dec);



    }
}
