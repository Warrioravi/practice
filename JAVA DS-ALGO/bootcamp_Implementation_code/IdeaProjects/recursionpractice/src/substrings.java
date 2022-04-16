import java.util.Scanner;

public class substrings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        printsubstrings(input,"");
    }
    public static void printsubstrings(String str,String res){
        if (str.length()==0){
            System.out.println(res);
            return;
        }
        char cc=str.charAt(0);
        String restofstring=str.substring(1);
        printsubstrings(restofstring,res);
        printsubstrings(restofstring,res+cc);
    }
}
