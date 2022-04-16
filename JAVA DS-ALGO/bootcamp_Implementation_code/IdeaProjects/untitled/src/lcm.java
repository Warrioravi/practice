import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int small,hcf=1,lowestcommonmultiple;
        if (n1>n2){
            small=n2;
        }
        else {
            small=n1;
        }
        for (int i = 2; i <=small ; i++) {
            if(n1%i==0 && n2%i==0){
                hcf=i;

            }
        }

        lowestcommonmultiple=n1*n2/hcf;
        System.out.println(lowestcommonmultiple);
    }
}
