package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterRight {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(NGR(new int[]{41304,13,4,14,34,5,35,324,34,68,23424})));
    }
    public static int[] NGR(int [] arr) {
        int[] ngr = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        ngr[arr.length-1]=-1;
        stack.push(arr[arr.length-1]);

        for (int i = arr.length - 2; i >= 0; i--) {
                while (!stack.isEmpty() && stack.peek() < arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ngr[i] = -1;
                } else {
                    ngr[i] = stack.peek();
                }
                stack.push(arr[i]);



        }
        return  ngr;

    }
}
