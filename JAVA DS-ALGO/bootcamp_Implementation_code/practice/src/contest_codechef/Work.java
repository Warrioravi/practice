package contest_codechef;

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int test=s.nextInt();

        for (;test>0;test--) {
            int total_hours=0;
            for (int i = 0; i < 5; i++) {
                total_hours+=s.nextInt();
            }
            int p=s.nextInt();
            if (total_hours*p<=120){
                System.out.println("N0");

            }
            else{
                System.out.println("Yes");
            }

        }
    }




}
