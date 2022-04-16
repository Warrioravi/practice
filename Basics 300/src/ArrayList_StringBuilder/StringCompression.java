package ArrayList_StringBuilder;

import java.util.Scanner;

public class StringCompression {
    public static String compression1(String str){
        StringBuilder sb=new StringBuilder();
        int index=0;
        while(index<str.length()){
            char cc=str.charAt(index);
            index++;
            sb.append(cc);
            int count=1;
            while(index<str.length()&&str.charAt(index)==cc){
                index++;
                count++;
            }
            if(count>1){
                sb.append(count+"");
            }
        }

        return sb.toString();
    }

    public static String compression2(String str){
        StringBuilder sb=new StringBuilder();
        int index=0;
        while(index<str.length()){
            char cc=str.charAt(index);
            index++;
            sb.append(cc);

            while(index<str.length()&&str.charAt(index)==cc){
                index++;

            }

        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression2(str));
        System.out.println(compression1(str));

    }

}
