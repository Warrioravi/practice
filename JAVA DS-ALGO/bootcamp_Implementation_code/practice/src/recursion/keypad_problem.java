package recursion;

public class keypad_problem {

    public static void main(String[] args) {
        find_possible_strings("123","");
    }

    public static String getstring(char c){
      if (c=='1'){
          return "abc";
      }
      if (c=='2'){
          return "def";
      }
      if (c=='3'){
          return "ijk";
      }
      return "";
    }


    public static void find_possible_strings(String input,String ans){
        if (input.length()==0){
            System.out.println(ans);
            return;
        }
        char  curr= input.charAt(0);
        String ros=input.substring(1);
        String code=getstring(curr);
        for (int i = 0; i <code.length() ; i++) {
            char c=code.charAt(i);
            find_possible_strings(ros,ans+c);
        }

        return;



    }




}
