package recursion.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class getSubsequences {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        ArrayList<String> ans=gss(str);
        System.out.print(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> baseAns=new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        char cc=str.charAt(0);
        String ros=str.substring(1);


        ArrayList<String> recursionAns=gss(ros);
        ArrayList<String> myAns=new ArrayList<>();
        //choice of not including current character
        for(String string:recursionAns){
            myAns.add(string);
        }
        //choice of including current character
        for(String string:recursionAns){
            myAns.add(cc+string);
        }
        return myAns;
    }
}
