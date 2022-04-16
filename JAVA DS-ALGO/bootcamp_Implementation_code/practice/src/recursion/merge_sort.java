package recursion;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr={11,45,78,58,1,3,5,7,9};

        System.out.println(Arrays.toString(mergesort(arr,0,arr.length-1)));
    }
    public static int[] mergesort(int[] arr,int si,int li){
        if ((si == li)) {
        return new int[]{arr[si]};

        }
        int mid=(li+si)/2;
        int[] left=mergesort(arr,si,mid);
        int[] right=mergesort(arr,mid+1,li);
         return merge(left,right);
    }
    public static int[] merge(int[] arr1,int arr2[]){
        int sol[]=new int [arr1.length+arr2.length] ;
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length&&j<arr2.length){
            if (arr1[i]<arr2[j]){
                sol[k]=arr1[i];
                k++;
                i++;
            }
            else{
                sol[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            sol[k]=arr1[i];
            k++;
            i++;
        }
        while (j<arr2.length){
            sol[k]=arr2[j];
            k++;
            j++;
        }
        return sol;




    }

}
