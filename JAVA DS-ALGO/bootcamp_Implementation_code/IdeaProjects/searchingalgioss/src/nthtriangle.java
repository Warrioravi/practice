import java.util.Scanner;

public class nthtriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        System.out.println(nthtri(input));


    }
    public static int nthtri(int n){
        if (n==1){
            return 1;
        }
        int sum=n+nthtri(n-1);
        return sum;
    }
}
