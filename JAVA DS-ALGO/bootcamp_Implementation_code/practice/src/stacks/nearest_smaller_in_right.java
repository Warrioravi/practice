package stacks;

import java.util.Stack;

public class nearest_smaller_in_right {
    public static void main(String[] args) {
        int[] arr={5,6,8,2,1,4};
        int[] ans=smallerright(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] smallerright(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for (int i = arr.length-1; i >=0; i--) {
            if (s.isEmpty()){
                ans[i]=-1;
            }
            else if (s.peek()<arr[i]){
                ans[i]=s.peek();
            }
            else if (s.peek()>arr[i]){
                while (!s.isEmpty()&&s.peek()>arr[i]){
                    s.pop();
                }
                if (s.isEmpty()){
                    ans[i]=-1;
                }
                else ans[i]=s.peek();



            }
            s.push(arr[i]);
        }
        // reverse(ans);
        return ans;

    }
}
