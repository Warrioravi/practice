package recursion;

import java.util.Scanner;

public class Tower_of_Hanoi {
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        TOH(n,"A","C","B");
    }
    public static void TOH(int n,String start,String end,String helper){
        if(n==0){
            return;
        }
        TOH(n-1,start,helper,end);
        System.out.println(n+":"+start+"->"+end);
        TOH(n-1,helper,end,start);

    }
}
