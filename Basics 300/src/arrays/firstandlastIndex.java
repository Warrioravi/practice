package arrays;

import java.util.Scanner;

public class firstandlastIndex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        System.out.println(firstIndex(arr,target));
        System.out.println(lastIndex(arr,target));
    }
    public static int firstIndex(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static int lastIndex(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;

    }

}
