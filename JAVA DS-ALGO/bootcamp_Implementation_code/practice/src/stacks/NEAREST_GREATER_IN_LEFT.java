package stacks;

import java.util.Stack;

public class NEAREST_GREATER_IN_LEFT {
    public static void main(String[] args) {
         int[] arr={5,6,8,2,1,4};
        int[] ans=greaterleft(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] greaterleft(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (s.isEmpty()){
                ans[i]=-1;
            }
            else if (s.peek()>arr[i]){
                ans[i]=s.peek();
            }
            else if (s.peek()<arr[i]){
                while (!s.isEmpty()&&s.peek()<arr[i]){
                    s.pop();
                }
                if (s.isEmpty()){
                    ans[i]=-1;
                }
                else ans[i]=s.peek();



            }
            s.push(arr[i]);
        }
        return ans;
    }
}
