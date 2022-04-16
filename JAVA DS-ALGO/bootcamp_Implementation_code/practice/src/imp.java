import java.util.Scanner;

public class imp {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        if(input==1){
            return ;
        }
        if(input==2){

            return;
        }
        for (int i = 2; i <input ; i++) {
           if(isprime(i)){
               System.out.print(i+" ");
           }
        }
    }
    public static boolean isprime(int n){
        int factors=0;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
