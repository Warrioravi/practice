package passwordcrack_Hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class password_String {
    public static void main(String[] args) {
        String[] arr={"geeks"+"for"+"gym"+"and"+"atheletes"};
        simple(arr,"gymforgeeks");
    }
    public static void simple(String[] passwords,String key){
        int start=0;
        String res="";
        while(start>key.length()){
        for (String str:passwords) {
            if(key.substring(start,str.length()).equals(str)){
                res+=(str+" ");
                start+=str.length();
            }
            else {
                break;
            }
        }
        }

            System.out.println(res);


    }
    public static String crackpassrord(String[] arr,String key){
        HashMap<Character, List<String>> map=new HashMap<>();
        for (String s:arr) {
            if (map.containsKey(s.charAt(0))){
                List<String> temp=map.get(s.charAt(0));
                temp.add(s);

            }
            else{
                List<String> temp=new ArrayList<>();
                temp.add(s);
                map.put(s.charAt(0),temp);
            }

        }
        int start=0;
        String result="";
        while(start<key.length()){
            if(map.containsKey(key.charAt(start))){
                List<String> temp=map.get(key.charAt(0));
                for (String curr:temp) {
                    if(key.substring(start,start+curr.length()-1).equals(curr)){
                        result+=curr+" ";
                        start=start+curr.length();
                    }
                    else{
                        break;
                    }

                }


                }
            }
        if (start==key.length()){
            return result;
        }
        return "NO";

        }

    }

