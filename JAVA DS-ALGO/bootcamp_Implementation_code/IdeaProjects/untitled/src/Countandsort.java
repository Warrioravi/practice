import java.util.Scanner;

public class Countandsort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int min, max, size;
            size = s.nextInt();
            min = s.nextInt();
            max = s.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
            }
            int[] sortedarray = new int[size];
            int k = 0;
            for (int i = 0; i < size; i++) {
                for (int j = min; j <=max; i++) {
                    if (arr[j]==i) {
                        sortedarray[k] = i;
                        k++;
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                System.out.print(sortedarray[i] + " ");


        }

    }
}