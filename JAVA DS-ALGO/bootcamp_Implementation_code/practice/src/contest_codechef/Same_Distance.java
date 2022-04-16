package contest_codechef;

import java.util.*;

public class Same_Distance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        while (test > 0) {


            int same_dis = 0;
            int no_sec = s.nextInt();
            int[] bob = new int[no_sec];
            int[] alice = new int[no_sec];
            for (int i = 0; i < no_sec; i++) {
                bob[i] = s.nextInt();
            }
            for (int i = 0; i < no_sec; i++) {
                alice[i] = s.nextInt();
            }
            int d1=0,d2=0;
            for (int i = 0; i < no_sec; i++) {
                if (bob[i] == alice[i]&&d1==d2) {
                    same_dis += bob[i];
                }
                d1+=bob[i];
                d2+=alice[i];
            }
            System.out.println(same_dis);

            test--;
        }
    }
}




