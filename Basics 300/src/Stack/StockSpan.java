package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(StackSpan(new int[]{2, 5 ,9 ,3 ,1 ,12, 6, 8 ,7})));

    }
    public static  int[] StackSpan(int[] arr){
        int[] span=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            while (stack.size()>0&&arr[stack.peek()]<arr[i]){
                  stack.pop();
            }
            if(stack.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return span;
    }

}
