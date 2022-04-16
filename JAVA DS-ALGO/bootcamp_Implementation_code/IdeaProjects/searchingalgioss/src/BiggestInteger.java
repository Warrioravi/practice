import java.util.Scanner;

public class BiggestInteger {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int[] arr=new int[input];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();

        }




    }
    public static void selection_sort(int[] arr) {
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
