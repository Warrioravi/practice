package ArrayList_StringBuilder;

import java.util.Scanner;

public class Allpallindromes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        printpallindromes(str);
    }
    public  static  void printpallindromes(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                String currString=str.substring(i,j);
                if(check(currString)){
                    System.out.println(currString);
                }
            }
        }
    }
    public static  boolean check(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return  false;
            }
            left++;
            right--;
        }
        return true;
    }
}
