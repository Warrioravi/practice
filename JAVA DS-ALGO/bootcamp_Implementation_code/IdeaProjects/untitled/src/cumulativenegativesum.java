import java.util.Scanner;

public class cumulativenegativesum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int cumulativesum=0;
        while(cumulativesum>=0) {
            int input = s.nextInt();
            cumulativesum+=input;
            if (cumulativesum>=0) {
                System.out.println(input);
            }


        }
    }
}
