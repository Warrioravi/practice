package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class Stock_Span {
    static class obj {
        obj(int val, int index) {
            this.val = val;
            this.index = index;
        }

        int val;
        int index;
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int[] ans = new int[arr.length];
        Stack<obj> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (s.isEmpty()) {
                ans[i] = -1;
            } else if (s.peek().val > arr[i]) {
                ans[i] = s.peek().index;
            } else if (s.peek().val < arr[i]) {
                while (!s.isEmpty() && s.peek().val < arr[i]) {
                    s.pop();
                }

                if (s.isEmpty()) {
                    ans[i] = -1;
                } else ans[i] = s.peek().index;
            }
            s.push(new obj(arr[i], i));
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = i - ans[i];
        }
        System.out.println(Arrays.toString(ans));
        StockSpan(arr);


    }

    public static void StockSpan(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[arr.length];
        ans[0]=1;

        s.push(ans[0]);
        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

                if (s.isEmpty()) {
                    ans[i] = i ;
                }
                else ans[i] = i - s.peek();
                s.push(i);

        }
        System.out.println(Arrays.toString(ans));

    }
}

