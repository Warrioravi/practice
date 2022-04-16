package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String  str=s.nextLine();
        System.out.println(isBalanced(str));

    }
    public static boolean isBalanced(String str){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            if(curr=='{'||curr=='['||curr=='('){
                stack.push(curr);
            }
            else if (curr=='}'||curr==']'||curr==')'){
                if(stack.isEmpty()){
                    return false;
                }
                char corresponding_closing_bracket=get(curr);
                if(stack.peek()!=corresponding_closing_bracket){
                    return  false;
                }
                else{
                  stack.pop();
                }
            }
            }
        return stack.isEmpty();
        }


        public  static char get(char c){
            switch (c){
                case '}':
                    return '{';
                case ')':
                    return '(';
                case ']':
                    return '[';

            }
            return 'a';

        }
    }

