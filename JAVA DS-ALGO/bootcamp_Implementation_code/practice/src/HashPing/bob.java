package HashPing;

import java.util.HashMap;
import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int test_cases=s.nextInt();
        s.nextLine();
        while(test_cases>0){
            String S=s.nextLine();
            String T=s.nextLine();
            System.out.println(calc_no_of_operations(S,T));
        test_cases--;
        }
    }

    public static int calc_no_of_operations(String S,String T){
        HashMap<Character,Integer> map_of_S=new HashMap<>();
        for (int i = 0; i < S.length(); i++) {

            char current=S.charAt(i);
            if (map_of_S.containsKey(current)){
                int value=map_of_S.get(current);
                map_of_S.put(current,value+1);
            }
            else {
                map_of_S.put(current,1);
            }
        }
        for (int i = 0; i < T.length(); i++) {

            char current=T.charAt(i);
            if (map_of_S.containsKey(current)){
                int value=map_of_S.get(current);
                map_of_S.put(current,value-1);
            }
            else {
                map_of_S.put(current,1);
            }
        }
        int operations = 0;
        for (float value : map_of_S.values()) {
            operations += Math.abs(value);
        }




return  operations;
    }
}
