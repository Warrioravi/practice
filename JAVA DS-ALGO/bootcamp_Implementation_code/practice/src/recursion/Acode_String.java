package recursion;

public class Acode_String {
static char[] code={'0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static void main(String[] args) {
        Generate_Acode_Strings("1212","");
    }
    public static void Generate_Acode_Strings(String str,String res){
        if(str.length()==0){
            System.out.println(res);
            return;
        }
        if (str.length()>=2) {
            int two = Integer.parseInt(str.substring(0, 2));
            if (two <= 26) {
                char current=code[two];
                Generate_Acode_Strings(str.substring(2),res+current);
            }
        }
        char cc= str.charAt(0);
        String ros=str.substring(1);
        Generate_Acode_Strings(ros,res+code[Character.getNumericValue(cc)]);
        return;

    }




}
