import java.util.Scanner;

public class firstn1n2terms {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int count=0;
        int n=1;
        while(count<n1){
            if((3*n+2)%n2!=0){
                System.out.println(3*n+2);
                count++;

            }
            n++;

        }


    }
}
