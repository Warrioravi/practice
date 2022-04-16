package recursion.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class getStairPath {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<String> ans=getStairPaths(n);
        System.out.println(ans);

    }
    //proactive way
    public static ArrayList<String> getStairPaths(int n) {
        if (n==0){
            ArrayList<String> baseAns=new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        ArrayList<String> myAns=new ArrayList<>();
        for(int i=1;i<=3&&n-i>=0;i++){
            ArrayList<String> currAns=getStairPaths(n-i);
            for(String string:currAns){
                myAns.add(i+string);
            }
        }
        return myAns;
    }
    ///reactive way
    public static ArrayList<String> getStairPaths1(int n) {
        if (n==0){
            ArrayList<String> baseAns=new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        if (n<0){
            //return empty Arraylist
            ArrayList<String> baseAns=new ArrayList<>();
            return baseAns;
        }
        ArrayList<String> currAns1=getStairPaths1(n-1);
        ArrayList<String> currAns2=getStairPaths1(n-2);
        ArrayList<String> currAns3=getStairPaths1(n-3);


        ArrayList<String> myAns=new ArrayList<>();


        for(String string:currAns1){
            myAns.add(1+string);
        }
        for(String string:currAns2){
            myAns.add(2+string);
        }
        for(String string:currAns3){
            myAns.add(3+string);
        }

        return myAns;
    }
}
