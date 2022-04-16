import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Binarysearch
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(binarysearch(arr,3));
    }
    public static int binarysearch(int[] arr,int target)
    {
        int left=0;
        int right=arr.length;
        int mid=(left+right)/2;
      while (left<=right){
          if(arr[mid]==target){
              return mid;
          }
          else if(target<arr[mid]){
              right=mid-1;
          }
          else{
              target=mid+1;
          }
      }
     return -1;
    }

}

