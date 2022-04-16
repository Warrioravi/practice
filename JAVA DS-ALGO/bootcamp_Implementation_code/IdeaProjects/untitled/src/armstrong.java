import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
   Scanner s= new Scanner(System.in);
   long input=s.nextLong();
        System.out.println(isarmstrong(input));


    }
    static boolean isarmstrong(long input){
        long rem,order=0,newnum=0;
        long x=input;
        //calculating order of number
        while (x>0){
            order++;
            x=x/10;
        }
        x=input;
        while (x>0){
            rem=(int)x%10;
            newnum=(long)(newnum+Math.pow(rem,order));
            x=x/10;
        }
        if (newnum==input){
            return (true);
        }
        else{
            return (false);

        }

    }
}
