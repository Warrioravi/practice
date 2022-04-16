import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int length = String.valueOf(input).length();
        int arr[] = new int[length];
        while (input > 0) {
            int rem = input % 10;
            arr[rem - 1] = rem;
            input /= 10;
        }
        for (int i = 0; i < length; i++) {


            System.out.print(arr[i]+" ");

        }
    }
}

