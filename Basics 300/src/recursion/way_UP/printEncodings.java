package recursion.way_UP;

import java.util.Scanner;

public class printEncodings {


        public static void main(String[] args) throws Exception {
            Scanner s=new Scanner(System.in);
            String str=s.nextLine();
            printEncodings(str,"");
        }

        public static void printEncodings(String str,String ans) {
            if(str.length()==0){
                System.out.println(ans);
                return;
            }
            char cc=str.charAt(0);
            if(cc=='0'){
                return;
            }
            //single

            String ros=str.substring(1);
            char enc=(char)(cc-'0'-1+'a');
            printEncodings(ros,ans+enc);

            //double
            if(str.length()>=2){
                int tensPlace=str.charAt(0)-'0';
                int onesPlace=str.charAt(1)-'0';
                int val=tensPlace*10+onesPlace;
                if(val>=10&&val<=26){
                    String ros2=str.substring(2);
                    char enc2=(char)('a'+val-1);
                    printEncodings(ros2,ans+enc2);
                }
            }


        }



}
