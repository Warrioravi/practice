package Stack;

import java.util.Scanner;
import java.util.Stack;

public class duplicateBrackets {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String  str=s.nextLine();
        System.out.println(check(str));
    }
    public static boolean check(String str){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            if(curr==')'){
                if (stack.peek()=='('){
                    return true;
                }
                else{
                 while(stack.peek()!='('){
                  stack.pop();
                 }
                 stack.pop();
                }
            }
            else{
                stack.push(curr);
            }
        }
        return false;
    }
}
