package nagarro_practice;

public class balancedbracketgeneration {
    public static void main(String[] args) {
        generate(3,0,0,0,"");


    }
    public  static  void generate(int n,int open,int close,int total,String ans){
        if (open>n){
            return;
        }
        if (close>n){
            return;
        }
        if (open<close){
         return;
        }
        if (total==2*n){
            System.out.println(ans);
            return;
        }

        generate(n,open+1,close,total+1,ans+"(");
        generate(n,open,close+1,total+1,ans+")");
    }
}
