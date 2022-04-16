package Arrays;

public class rotated {
    public static void main(String[] args) {
        int[] arr={5, 6, 8,-2, 2, 3, 4};
        int left=0,right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if (arr[mid]<arr[mid+1]&&arr[mid]<arr[mid-1]){
                System.out.println(arr[mid]);
                break;
            }
            else if (arr[mid]>arr[left]){
                left=mid+1;
            }
            else right=mid-1;
        }
    }
}
