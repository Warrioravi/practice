package test;

import java.util.*;
import java.lang.*;
public class dp {
    public static void main (String args[]) {
        Scanner sc= new Scanner (System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            System.out.println( lexo(str));
        }
    }
    public static String lexo(String s){
        if(s==null||s.length()<=1){
            return s;
        }
        Map<Character,Integer>lastIndexMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            lastIndexMap.put(c,i);

        }
        StringBuilder sb= new StringBuilder();
        int start=0;
        int end= findsmallestindex(lastIndexMap);
        while(!lastIndexMap.isEmpty()){
            char curr='z'+1;
            int index=0;
            for(int i=start;i<=end;i++){
                char c=s.charAt(i);
                if((c<curr)&& (lastIndexMap.containsKey(c))){
                    curr=c;
                    index=i;
                }
            }
            sb.append(curr);
            lastIndexMap.remove(curr);
            start=index+1;
            end=findsmallestindex(lastIndexMap);


        }
        return sb.toString();
    }
    public static int findsmallestindex(Map<Character,Integer>lastIndexMap){
        int result=Integer.MAX_VALUE;
        for(int index:lastIndexMap.values()){
            result=Math.min(result,index);
        }
        return result;
    }
}