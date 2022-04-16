package recursion;

import java.util.ArrayList;


public class store_occurences {
    public static void main(String[] args) {
        int[] arr= {1,3,1,8,6,4,6,6,2,8};
        ArrayList<Integer> ANS=new ArrayList<>();
        store_rec(arr,ANS,0,8);
        System.out.println(ANS);
    }
    public static void store_rec(int[] arr,ArrayList<Integer> ans,int currIndex,int target){
        if(currIndex==arr.length){
            return;
        }
        if (arr[currIndex]==target){
            ans.add(currIndex);
        }
        store_rec(arr,ans,currIndex+1,target);


    }
}
