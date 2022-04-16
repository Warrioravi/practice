package recursion.way_UP;

public class subsequences {
    public static void main(String[] args) {
        printSS("abc","");
    }
    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char cc=str.charAt(0);
        String ros=str.substring(1);
        printSS(ros,ans+cc);
        printSS(ros,ans);
        return;
    }

}

//    public static void PrintSS(String str, String res) {
//        if (str.length() == 0) {
//
//            System.out.println(res);
//            return;
//
//        }
//
//
//        char cc = str.charAt(0);
//        String ros = str.substring(1);
//        PrintSS(ros, res);
//        PrintSS(ros, res + cc);
//
//        return;
//
//
//    }