package pattern;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
    int innerspace=-1;
    int outerspace=n/2;
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < outerspace; j++) {
                System.out.print("\t");
            };
            System.out.print("*"+"\t");

            for (int j = 0; j <innerspace; j++) {
                System.out.print("\t");
            }
            if (i!=1&&i!=n){
                System.out.print("*"+"\t");
            }
            if (i<=n/2){
                innerspace+=2;
                outerspace-=1;
            }
            else {
                innerspace-=2;
                outerspace+=1;

            }
            System.out.println();

        }




    }
}
