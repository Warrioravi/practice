package recursion;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int[] arr2={12,23,45,56,78,89};
        System.out.println(bsearch(arr2,89,0,arr2.length-1));

    }
    public static int  bsearch(int[] arr,int target,int left,int right){
        if (left>right){
            return -1;
        }
        int mid=(left+right)/2;
        if(arr[mid]==target){
         return  mid;
        }
        else if(arr[mid]>target)
        {
            return bsearch(arr,target,left,mid-1);
        }
        else{
            return bsearch(arr,target,mid+1,right);
        }


    }
}
