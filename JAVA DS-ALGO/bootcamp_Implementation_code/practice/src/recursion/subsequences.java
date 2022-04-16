package recursion;

import java.util.ArrayList;

public class subsequences {
    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();
        PrintSS("abc","",ans);
        //System.out.println(ans);
    }
    public static void PrintSS(String str, String res, ArrayList<String> list){
        if (str.length()==0) {
            //list.add(res);
            System.out.println(res);
            return;

        }



        char cc=str.charAt(0);
        String ros=str.substring(1);
        PrintSS(ros,res,list);
        PrintSS(ros,res+cc,list);

        return;







    }



}
