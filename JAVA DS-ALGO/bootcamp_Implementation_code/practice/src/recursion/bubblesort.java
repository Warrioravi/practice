package recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={2,5,5,5,5,54,5,7,8,5,4,5,45,4,54,5,4,65};
        //sort_iterative(arr);
        //System.out.println(Arrays.toString(arr));
        //recursive_bsort(arr,arr.length);
        //System.out.println(Arrays.toString(arr));
        complete_recursivesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public  static void  recursive_bsort(int[] arr,int n) {
        if (n==1){
            return;
        }
        for (int j=1;j<=n-1;j++){
            if(arr[j]<arr[j-1]){
                swaap(arr,j,j+1);

            }
        }
        recursive_bsort(arr,n-1);

    }
    public static void swaap(int[] arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;

    }

   public static void complete_recursivesort(int arr[],int si,int li){
        if (li==0){
            return;
        }
        if(si==li){
            complete_recursivesort(arr,0,li-1);
            return;

        }

        if (arr[si]>arr[si+1]){
            swaap(arr,si,si+1);
        }
        complete_recursivesort(arr,si+1,li);
   }

    public static void sort_iterative(int[] arr){
        for (int i = 1; i <arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }



}
