package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreaterToRight {
    public static void main(String[] args) {
        int[] arr={5,6,8,2,1,4};
        nextgreat(arr);
    }
    public static void  nextgreat(int[] arr){
        Stack<Integer> stack =new Stack<>();
        int[] ans=new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
            if (stack.isEmpty()){
                ans[i]=-1;
            }
            else if (stack.peek()>arr[i]){
                ans[i]=stack.peek();
            }
            else if (stack.peek()<arr[i]){
                while (!stack.isEmpty()&&stack.peek()<=arr[i]){
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
    public static int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        return getMax(heights, 0, heights.length);
    }
    static int getMax(int[] heights, int s, int e) {
        if (s + 1 >= e) return heights[s];
        int min = s;
        boolean sorted = true;
        for (int i = s; i < e; i++) {
            if (i > s && heights[i] < heights[i - 1]) sorted = false;
            if (heights[min] > heights[i]) min = i;
        }
        if (sorted) {
            int max = 0;
            for (int i = s; i < e; i++) {
                max = Math.max(max, heights[i] * (e - i));
            }
            return max;
        }
        int left = (min > s) ? getMax(heights, s, min) : 0;
        int right = (min < e - 1) ? getMax(heights, min + 1, e) : 0;
        return Math.max(Math.max(left, right), (e - s) * heights[min]);
    }
}
