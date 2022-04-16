package October13;
import java.util.*;

public class DegreeOfArray {
    public static void main(String[] args) {

    }
    public static int findShortestSubArray(int[] nums) {
        //algo should be
        //1. lets find out the highest degree and the highest occuring number
        //find the first and last occurance of that number
        //return last-first
        int[] count=new int[50000];
        int max=0;
        for(int i:nums){
            count[i]++;
            max=Math.max(max,count[i]);
        }
        if(max==1||nums.length==1){
            return 1;
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(count[nums[i]]==max)
            {
                if(!map.containsKey(nums[i])){
                    map.put(nums[i],i);
                }
            }
        }
        int mindiff=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            int curr=nums[i];
            if(count[curr]==max){
                if(!map.isEmpty()&&map.containsKey(curr))
                {
                    int diff=i-map.get(curr)+1;
                    mindiff=Math.min(diff,mindiff);
                    map.remove(curr);
                }
            }
        }
        return mindiff;



    }






}
