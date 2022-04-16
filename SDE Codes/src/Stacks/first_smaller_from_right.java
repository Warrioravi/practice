package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class first_smaller_from_right {
    public static void main(String[] args) {
        int[] arr={5,6,8,2,1,4};
        int[] ans=nextsmall(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[]  nextsmall(int[] arr){
        Stack<Integer> stack =new Stack<>();
        int[] ans=new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
            if (stack.isEmpty()){
                ans[i]=-1;
            }
            else if (stack.peek()<arr[i]){
                ans[i]=stack.peek();
            }
            else if (stack.peek()>arr[i]){
                while (!stack.isEmpty()&&stack.peek()>arr[i]){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    ans[i]=-1;
                }
                else ans[i]=stack.peek();
            }
            stack.push(arr[i]);

        }
        return ans;
    }
}
