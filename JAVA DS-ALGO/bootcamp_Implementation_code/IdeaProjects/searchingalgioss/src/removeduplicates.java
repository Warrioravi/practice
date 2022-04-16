import java.util.Arrays;
import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char a=str.charAt(i);
            String removedduplicates=sb.toString();
            if(!removedduplicates.contains(str.substring(i,i+1))){
                 sb.append(a);
            }

        }
        System.out.println(sb.toString());

    }
    }

