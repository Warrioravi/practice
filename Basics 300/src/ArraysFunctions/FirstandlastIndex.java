package ArraysFunctions;

import java.util.Scanner;

public class FirstandlastIndex {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int target=s.nextInt();
        int low=0;
        int high=arr.length-1;
        int first=-1;
        int last=-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(target==arr[mid]){
                high=mid-1;
                first=mid;
            }
            else if(target>arr[mid]){
                low=mid+1;

            }
            else{
                high=mid-1;
            }


        }
        low=0;
        high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(target==arr[mid]){
               low=mid+1;
                last=mid;
            }
            else if(target>arr[mid]){
                low=mid+1;

            }
            else{
                high=mid-1;
            }


        }
        System.out.println(first);
        System.out.println(last);
    }
}
