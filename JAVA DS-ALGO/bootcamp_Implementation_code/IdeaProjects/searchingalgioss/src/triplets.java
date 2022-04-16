import java.util.Scanner;

public class triplets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int[] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int target = s.nextInt();
        int n = arr.length;
        sort(arr);
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];
                    if (a + b + c == target) {
                        System.out.println(a + "," + b + "and" + c);
                    }
                }
            }

        }

    }

    public static void sort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }


            }
            swap(arr, i, min);

        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
