package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.zip.CheckedInputStream;

public class permutationstring {
    public static void main(String[] args) {
        //System.out.println(result("bat","b"));
       // System.out.println(minimized("aaabccddd"));
        //System.out.println(checkcamelcases("oneCoolWriter"));
        System.out.println(powerSum(1,100,2));

    }
    public static String result(String s1,String s2){
        String res="NO";
        HashMap<Character,Boolean> map=new HashMap<>();
        for (char a:s1.toCharArray()){
            map.put(a,true);
        }
        for (char a:s2.toCharArray()){
            if(map.containsKey(a)){
                res="YES";
                break;
            }
        }
        return res;

    }
    public static String minimized(String str){
        Stack<Character> stack=new Stack<>();
        stack.push(str.charAt(0));
        char[] arr=str.toCharArray();
        for (int i=1;i<arr.length;i++) {
            if (!stack.isEmpty()) {
                if (stack.peek() == arr[i]) {
                    stack.pop();
                } else {
                    stack.push(arr[i]);
                }
            }
            else {
                stack.push(arr[i]);
            }
        }
        if (stack.isEmpty()){
            return "Empty String";

        }
        StringBuilder res=new StringBuilder();
        for (char a:stack) {
            res.append(a);

        }
        return res.toString();
    }
    public static int checkcamelcases(String s){
        if(s.length()==0){
            return 0;
        }
        int num=1;
        for (char a:s.toCharArray()) {
            if(a>='A'&&a<='Z'){
                num++;

            }

        }
        return num;
    }
    static int powerSum(int curr,int target, int N) {
        if(target==0){
            return 1;
        }
        if(target<0)
        {
            return 0;
        }
        int ways=0;
        if (Math.pow(curr,N)==target){
            ways++;
        }
        for(int i=curr+1;Math.pow(i,N)<=target;i++){
            ways=powerSum(i,target-(int)Math.pow(curr,N),N);
        }
        return ways;


    }
}
