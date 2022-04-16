package October10;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("4646516sa"));
    }
    public static  int myAtoi(String str) {
        str=str.trim();
        if(str==null||str.equals(""))
        {
            return 0;
        }
        long res=0;
        boolean isNegative=false;
        if(str.charAt(0)=='-'){
            isNegative=true;
        }
        else if(str.charAt(0)=='+'){
            isNegative=false;
        }else if(Character.isDigit(str.charAt(0))){
            res=str.charAt(0)-'0';
        }
        else{
            return 0;
        }
        for(int i=1;i<str.length();i++){
            char cc=str.charAt(i);
            if(!Character.isDigit(cc)){
                break;
            }
            else{
                res=res*10+(cc-'0');
                if(res>Integer.MAX_VALUE&&isNegative){
                    return Integer.MIN_VALUE;
                }
                else if(res>Integer.MAX_VALUE&&!isNegative){
                    return Integer.MAX_VALUE;
                }
            }
        }
        if(isNegative){
            return (int)(-1*res);
        }
        return (int)res;

    }
}
