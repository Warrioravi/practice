import java.util.Scanner;

public class Replacethemall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long input = s.nextLong();
        long newnum = 0, rev = 0;
        long rem;
        if (input == 0) {
            System.out.println("5");

        } else {
            while (input > 0) {
                rem = input % 10;
                if (rem == 0) {
                    rem = 5;
                    rev = rev * 10 + 5;
                } else {
                    rev = rev * 10 + rem;

                }
                input = input / 10;

            }
            while (rev > 0) {
                rem = rev % 10;
                newnum = newnum * 10 + rem;
                rev = rev / 10;
            }
            System.out.println(newnum);
        }
    }
}
