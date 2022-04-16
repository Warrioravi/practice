package Arrays;

public class hack {
    public static void main(String[] args) {
        String s="51Pa*0Lp*0e ";
        String ans="";
        int i=0;
        while(i<s.length()){
            char curr=s.charAt(i);
            if (curr>=48&&curr<=57){
                ans=curr+ans+'0';
                i++;
            }
            else if (i<s.length()-1&&s.charAt(i+1)>=65&&s.charAt(i+1)<=90&&curr>=97&&curr<=122){
             ans=ans+s.charAt(i+1)+curr+"*";
             i+=2;
            }
            else{
                ans=ans+curr;
                i++;
            }

        }
        System.out.println(ans);
    }
}
