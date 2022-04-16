import java.util.Scanner;

public class isarraysorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int[] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(issorted(arr, 0, arr.length - 1));


    }

    public static boolean issorted(int[] arr, int start, int last) {
        if (start == arr.length - 1) {
            return true;

        }
        if (arr[start] < arr[start + 1]) {
            return issorted(arr, start + 1, last);
        }
        return false;
    }
}
