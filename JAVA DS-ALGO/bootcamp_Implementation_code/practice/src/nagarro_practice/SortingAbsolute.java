package nagarro_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SortingAbsolute {
    public static void main(String[] args) {
        int[] arr={1,-1,5,-5,6,7,-8,9,-1,-85,-548,-56,85};
        for (int i = 1; i <arr.length; i++) {
            for (int j = 0; j <arr.length-i ; j++) {
                if(Math.abs(arr[j])>Math.abs(arr[j+1])){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
