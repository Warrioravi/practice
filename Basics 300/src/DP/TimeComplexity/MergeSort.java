package DP.TimeComplexity;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
      int[] arr=new int[]{21,34,35,4,6,5,3,121,543,54,454,66};
        System.out.println(Arrays.toString(MergeSort(arr, 0, arr.length - 1)));
    }
    public static int[] MergeSort(int[] arr,int start,int end){
        if (start==end){
            return new int[]{arr[start]};
        }
        int mid=(start+end)/2;
        int[] sortedleft=MergeSort(arr,start,mid);
        int[] sortedRight=MergeSort(arr,mid+1,end);
        int[] sorted=mergeTwoSortedArrays(sortedleft,sortedRight);
        return sorted;
    }
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int[] ans=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                ans[k]=a[i];
                k++;
                i++;
            }
            else{
                ans[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){
            ans[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            ans[k]=b[j];
            k++;
            j++;
        }

        return ans;
    }
}
