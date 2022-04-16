package nagarro_practice;

public class print_permutations {
    public static void main(String[] args) {
        String s="abc";
        printpm(s,"");
    }
    public static void printpm(String s,String res){
        if (s.length()==0){
            System.out.println(res);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
         char cc=s.charAt(i);
         String ros= s.substring(0,i)+s.substring(i+1);
         printpm(ros,res+cc);
        }
    }
}
