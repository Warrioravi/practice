package DP.TimeComplexity;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
    int[] arr=new int[]{1,1,1,2,0,1,2,0,1,0,2,0,1,2,1,1,1,1,0,0,0};
    sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void sort(int[] arr){
        int i=0,j=0,k=0;
        while (k<arr.length){
            if(arr[k]==2){
                k++;
            }
            else if(arr[k]==1){
                swap(arr,k,j);
                k++;
                j++;
            }
            else{
                swap(arr,k,j);
                swap(arr,i,j);
                i++;
                k++;
                j++;

            }
        }
    }
    public  static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
