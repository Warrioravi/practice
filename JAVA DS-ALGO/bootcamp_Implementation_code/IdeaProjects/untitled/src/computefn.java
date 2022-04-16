import java.util.Scanner;

public class computefn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test=s.nextInt();
        while(test>0) {
            long input = s.nextLong(), n1, n2;
            if (input % 2 == 0) {
                n1 = n2 = input / 2;
            } else {
                n1 = input / 2;
                n2 = input / 2 + 1;
            }
            long sumofeven = n1 * (n1 + 1);
            long sumofodd = n2 * n2;
            System.out.println(sumofeven - sumofodd);
            test--;
        }
    }

}
