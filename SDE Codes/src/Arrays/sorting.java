package Arrays;

import java.lang.reflect.Array;

public class sorting {
    public static void main(String[] args) {
        int arr[]={5659,89,59,9,59,4,494,949,5};
        bblesort(arr);

    }
    public static void bblesort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
