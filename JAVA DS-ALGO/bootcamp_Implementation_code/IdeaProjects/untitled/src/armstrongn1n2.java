import java.util.Scanner;

public class armstrongn1n2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2= s.nextInt();
        for (int i = n1; i < n2; i++) {
            if (isarmstrong(i)){
                System.out.println(i);
            }

        }
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
