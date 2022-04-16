import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public   class sca {
    public static void main (String[] args){
        Scanner s=new Scanner(System.in);
        int[] arr={1,2,3,4,4,4};
        System.out.println(findCount(arr,2 ));

    }

    public static  int findCount(int[] arr,int k){
        int count=0;
        int largest=arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            int val=arr[i]+k+1;
            if (val>largest){
                count+=arr.length-1-i;
            }
            else count+=floor(arr,arr[i]+k)-i;
        }
        return count;
    }
    public static  int  floor(int[] arr,int value){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if (arr[mid]>=value){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
public static int firdtDup(int[] arr){
    HashMap<Integer,Integer> map=new HashMap<>();

    for (int i = 0; i <arr.length; i++) {
        int curr=arr[i];
        if (map.containsKey(curr)){
            return i;
        }
        map.put(curr,i);
    }
    return -1;
}


}







