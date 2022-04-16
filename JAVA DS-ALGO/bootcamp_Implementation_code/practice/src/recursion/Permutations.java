package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public static void main (String[] args) {
        System.out.println(remove("acaaabbbacdddd"));
    }
    public static int findmin(int n){
        if(n==1){
            return 1;
        }
        if(n<1){
            return Integer.MAX_VALUE-2;
        }
        if(n%2==0){
            return 1+findmin(n/2);
        }
        else return 1+Math.min(findmin(n+1),findmin(n-1));

    }
    public static String removes(String str) {
        str.trim();
        String res = "";
        int index = 0;
        while (index < str.length()) {
            char cc = str.charAt(index);
            int count = 0;
            for (int i = index; i < str.length(); i++) {
                if (str.charAt(i) == cc) {
                    count++;
                } else break;
            }
            if (count == 1) {
                res += cc;
                index++;
            } else {
                index += count;
            }
        }
   return res;
    }

    static String removeUtil(String str, char last_removed)
    {
        if (str.length() == 0 || str.length() == 1)
            return str;
        if (str.charAt(0) == str.charAt(1))
        {
            last_removed = str.charAt(0);
            while (str.length() > 1 && str.charAt(0) == str.charAt(1))
                str = str.substring(1, str.length());
            str = str.substring(1, str.length());
            return removeUtil(str, last_removed);
        }


        String rem_str = removeUtil(str.substring(1,str.length()), last_removed);


        if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0))
        {
            last_removed = str.charAt(0);
            return rem_str.substring(1,rem_str.length());
        }


        if (rem_str.length() == 0 && last_removed == str.charAt(0))
            return rem_str;


        return (str.charAt(0) + rem_str);
    }

    static String remove(String str)
    {
        char last_removed = '\0';
        return removeUtil(str, last_removed);
    }

}



