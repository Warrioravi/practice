package Stack;

import java.util.Stack;

public class InfixEval {
    public static void main(String[] args) {

    }
    static  int infix(String expression){
        Stack<Integer> nums= new Stack<>();
        Stack<Character> operators=new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch= expression.charAt(i);
            if(ch=='('){

            }
            else if(Character.isDigit(ch)){

            }
            else if (ch==')'){

            }
            else{

            }
        }
      return 0;
    }
}
