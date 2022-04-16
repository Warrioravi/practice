import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(ispalindrome(str));
    }
    public static boolean ispalindrome(String s)
    {
        String b="";
        for (int i = s.length()-1; i >=0 ; i--) {
            b+=s.charAt(i);

        }
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==b.charAt(i))
            {
                continue;
            }
            else
            {
                return false;
            }

        }
        return true;


    }
}
