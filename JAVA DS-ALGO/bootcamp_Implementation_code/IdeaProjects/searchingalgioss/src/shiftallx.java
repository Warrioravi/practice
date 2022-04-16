import java.util.Scanner;

public class shiftallx {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        StringBuilder sb=new StringBuilder();
        check(str,sb,0);
        for (int i = 1; i <=str.length()-sb.length() ; i++) {
            sb.append('x');
        }
        System.out.println(sb.toString());

    }
    public static void check(String s,StringBuilder sb,int n ){
        if (n==s.length()){
            return;
        }
        if(s.charAt(n)!='x'){
            sb.append(s.charAt(n));
        }
        check(s,sb,n+1);
    }
}
