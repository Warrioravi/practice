package recursion.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class keypadProblem {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        ArrayList<String> ans=getKPC(str);
        System.out.print(ans);
    }

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> baseAns=new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        char cc=str.charAt(0);
        String curr=getString(cc);
        String ros=str.substring(1);


        ArrayList<String> recursionAns=getKPC(ros);
        ArrayList<String> myAns=new ArrayList<>();

        for(int i=0;i<curr.length();i++){
            for(String string:recursionAns) {
                myAns.add(curr.charAt(i)+string);
            }
        }

        return myAns;
    }
    public static String getString(char cc){
        if(cc=='0'){
            return ".;";
        }
        if(cc=='1'){
            return "abc";
        }
        if(cc=='2'){
            return "def";
        }
        if(cc=='3'){
            return "ghi";
        }
        if(cc=='4'){
            return "jkl";
        }
        if(cc=='5'){
            return "mno";
        }
        if(cc=='6'){
            return "pqrs";
        }
        if(cc=='7'){
            return "tu";
        }
        if(cc=='8'){
            return "vwx";
        }
        if(cc=='9'){
            return "yz";
        }
        return "";

    }
}
