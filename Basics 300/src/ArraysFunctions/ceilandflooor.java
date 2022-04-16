package ArraysFunctions;

import java.util.Scanner;

public class ceilandflooor {
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
        int ceil=0;
        int floor=0;
        while (low<=high){
            int mid=(low+high)/2;
            if(target<arr[mid]){
                high=mid-1;
                ceil=arr[mid];
            }
            else if(target>arr[mid]){
                low=mid+1;
                floor=arr[mid];
            }
            else{
                ceil=arr[mid];
                floor=arr[mid];
                break;
            }

        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
