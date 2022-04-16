package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class Next_greater_left {
    public static void main(String[] args) {
    int[] arr={5,6,8,2,1,4};
    nextgreat(arr);
}
    public static void  nextgreat(int[] arr){
        Stack<Integer> stack =new Stack<>();
        int[] ans=new int[arr.length];
        for (int i =0; i <arr.length; i++) {
            if (stack.isEmpty()){
                ans[i]=-1;
            }
            else if (stack.peek()>arr[i]){
                ans[i]=stack.peek();
            }
            else if (stack.peek()<arr[i]){
                while (!stack.isEmpty()&&stack.peek()<arr[i]){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    ans[i]=-1;
                }
                else ans[i]=stack.peek();
            }
            stack.push(arr[i]);

        }
        System.out.println(Arrays.toString(ans));
    }
}
