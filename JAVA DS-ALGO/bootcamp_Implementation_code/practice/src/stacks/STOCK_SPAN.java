package stacks;


import java.util.Arrays;
import java.util.Stack;

public class STOCK_SPAN {
    static class pair{
        int value;
        int index;
        pair(int value,int index){

            this.index=index;
            this.value=value;
        }
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        //stock span=INDEX-NGL[INDEX]
        int[] ans=NGLindex(arr);
        for (int i = 0; i < ans.length; i++) {
            ans[i]=i-ans[i];
        }
        System.out.println(Arrays.toString(ans));

    }
    public static int[] NGLindex(int[] arr){
        int[] ans=new int[arr.length];
        Stack<pair> s=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (s.isEmpty()){
                ans[i]=-1;
            }
            else if (s.peek().value>=arr[i]){
                ans[i]=s.peek().index;
            }
            else if (s.peek().value<arr[i]){
                while(!s.isEmpty()&&s.peek().value<=arr[i]){
                    s.pop();
                }
                if (s.isEmpty()){
                    ans[i]=-1;
                }
                else ans[i]=s.peek().index;
            }
            s.push(new pair(arr[i],i));
        }

     return ans;
    }
}
