package Stacks;

import com.sun.deploy.security.SelectableSecurityManager;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=s.nextInt();
//        }
//        int[] ans=nextsmall(arr);
//        for(int i:ans){
//            System.out.println(i+" ");
//        }
        System.out.println(convert("((A-(B/C))*((A/K)-L))"));

    }
    public static int[]  nextsmall(int[] arr){
        Stack<Integer> stack =new Stack<>();
        int[] ans=new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            if (stack.isEmpty()){
                ans[i]=-1;
            }
            else if (stack.peek()<arr[i]){
                ans[i]=stack.peek();
            }
            else if (stack.peek()>arr[i]){
                while (!stack.isEmpty()&&stack.peek()>arr[i]){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    ans[i]=-1;
                }
                else ans[i]=stack.peek();
            }
            stack.push(arr[i]);

        }
        return ans;
    }
    public static String convert(String infix){
        char[] arr=infix.toCharArray();
        Stack<Character> stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            char cc=arr[i];
            if (cc=='('||cc==')'){
                if (cc=='('){
                 stack.push(cc);
             }
             else{
                 while(!stack.isEmpty()&&stack.peek()!='('){
                     res.append(stack.pop());
                 }
                 if (!stack.isEmpty()){
                     stack.pop();
                 }

             }

         }
         else if(isOperator(cc)==1){
                 if (stack.isEmpty()){
                     stack.push(cc);
                 }
                 else if (prec(stack.peek())>=prec(cc)){
                     while(!stack.isEmpty()&&prec(stack.peek())>=prec(cc)){
                         res.append(stack.pop());
                     }
                     stack.push(cc);
                 }
                 else{
                     stack.push(cc);
                 }
         }
         else{
             res.append(cc);
         }

        }
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }
    public static int isOperator(char cc){
        if (cc=='('||cc==')'||cc=='+'||cc=='-'||cc=='*'||cc=='/'){
          return 1;
        }
        else{
            return 0;
        }
    }
    public static int prec(char cc){
        if (cc=='+'||cc=='-'){
            return  1;
        }
        if (cc=='*'||cc=='/'){
            return 2;
        }
        if (cc=='^'){
            return 3;
        }
           return -1;
    }
    static int Prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }


     public static String convertt(String exp)
    {

        String result = new String("");


        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c))
                result += c;


            else if (c == '(')
                stack.push(c);

            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression";
                else
                    stack.pop();
            }
            else
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){
                    if(stack.peek() == '(')
                        return "Invalid Expression";
                    result += stack.pop();
                }
                stack.push(c);
            }

        }


        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }


}