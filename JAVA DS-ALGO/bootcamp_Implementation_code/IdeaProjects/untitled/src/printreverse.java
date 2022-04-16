import java.util.Scanner;

public class printreverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long input=s.nextLong(),reverse=0;
        int rem;
        while (input > 0) {
            rem =(int)input % 10;
            reverse= reverse * 10 + rem;
            input = input / 10;
        }
        System.out.println(reverse);

    }
}
