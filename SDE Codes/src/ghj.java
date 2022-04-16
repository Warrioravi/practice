
import java.io.*;
        import java.util.*;


class Mcain {
    public static void main (String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){

            int size=s.nextInt();
            int start=s.nextInt();
            s.nextLine() ;
            Stack<Integer> stack=new Stack<>();
            stack.push(start);

            for(int i=0;i<size;i++)
            {
                String in=s.nextLine();
                if(in.equals("B")){
                    stack.pop();
                }
                else{
                    stack.push(Integer.parseInt(in.substring(2)));

                }
            }
            System.out.println(stack.peek());
        }

    }

}