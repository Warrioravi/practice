package nagarro_practice;

import java.util.HashSet;

public class printSubsequences {
    public static void main(String[] args) {
        printss("abc","");
    }
    public static void printss(String str, String res, HashSet<String> set){
        if (str.length()==0){
            set.add(res);
            return;
        }
        char cc=str.charAt(0);
        String ros=str.substring(1);
        printss(ros,res,set);
        printss(ros,res+cc,set);
        return;
    }


}
