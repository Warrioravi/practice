package LCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class capitalize {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="I am the best in this world";
        ArrayList<String> list=new ArrayList<>();
        list.add("am");
        list.add("this");
        String[] words=str.split(" ");
        StringBuilder res=new StringBuilder();
        for (String stri:words) {
            if (list.contains(stri)){
                res.append(stri+" ");
            }
            else res.append(cap(stri)+" ");

        }
        System.out.println(res);


    }
    public static String cap(String str){
        String f=str.substring(0,1).toUpperCase();


        return f+str.substring(1);
    }
}
