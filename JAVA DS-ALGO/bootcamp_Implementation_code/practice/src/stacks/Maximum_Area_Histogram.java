package stacks;

import java.util.Stack;

public class Maximum_Area_Histogram {
    static class obj {
        obj(int val, int index) {
            this.val = val;
            this.index = index;
        }

        int val;
        int index;
    }
    public static void main(String[] args) {
        int arr[]={6,2,5,4,5,1,6};
        MaxArea(arr);
    }
    public static void MaxArea(int[] arr){
        int[] left_smaller=NSL(arr);
        int[] right_smaller=NSR(arr);
        int[] width=new int[arr.length];
        for (int i = 0; i <width.length ; i++) {
            width[i]=right_smaller[i]-left_smaller[i]-1;
        }
        int[] area=new int[arr.length];
        int max=0;
        for (int i = 0; i < area.length; i++) {
            area[i]=width[i]*arr[i];
            max=Math.max(area[i],max);
        }

    }
    public  static  int[] NSL(int[] arr){
        int[] ans = new int[arr.length];
        Stack<obj> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (s.isEmpty()) {
                ans[i] = -1;
            } else if (s.peek().val < arr[i]) {
                ans[i] = s.peek().index;
            } else if (s.peek().val > arr[i]) {
                while (!s.isEmpty() && s.peek().val > arr[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    ans[i] = -1;
                } else ans[i] = s.peek().index;
            }
            s.push(new obj(arr[i], i));
        }
        return ans;

    }
    public  static  int[] NSR(int[] arr){
        int[] ans = new int[arr.length];
        Stack<obj> s = new Stack<>();
        for (int i = arr.length-1; i >=0; i--) {
            if (s.isEmpty()) {
                ans[i] = arr.length;
            } else if (s.peek().val < arr[i]) {
                ans[i] = s.peek().index;
            } else if (s.peek().val > arr[i]) {
                while (!s.isEmpty() && s.peek().val > arr[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    ans[i] = arr.length;
                } else ans[i] = s.peek().index;
            }
            s.push(new obj(arr[i], i));
        }
        return ans;
    }
}
