package arrays;

import java.util.Scanner;

public class BrokenEconomyCeilandFloor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
           arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        System.out.println(floor(arr,target));
        System.out.println(ceil(arr,target));

    }
    public static int floor(int[] arr,int target){
        int ans=-1;
        int low=0;
        int high=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target){
                ans=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return  ans;
    }
    public static int ceil(int[] arr,int target){
        int ans=-1;
        int low=0;
        int high=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return  ans;
    }
}
