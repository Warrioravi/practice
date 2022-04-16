package recursion;

public class subset_sum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        System.out.println(sub_sum(arr,22,arr.length));
    }
    public static boolean sub_sum(int[] arr,int target,int curr_index){
        if (target==0){
            return true;
        }
        if (curr_index==0){
            return  false;
        }
        if (arr[curr_index-1]<=target){
         return (sub_sum(arr,target-arr[curr_index-1],curr_index-1)||sub_sum(arr,target,curr_index-1));
        }
        else{
            return sub_sum(arr,target,curr_index-1);
        }

    }



}




