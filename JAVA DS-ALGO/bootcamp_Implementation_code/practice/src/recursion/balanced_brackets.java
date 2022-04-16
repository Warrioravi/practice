package recursion;

public class balanced_brackets {
    public static void main(String[] args) {
        int ans=print_brackets(3,0,0,0,"");
        System.out.println(ans);


    }
    public static int print_brackets(int n,int curr,int open,int close,String ans){

        if (open>n){
            return 0;
        }
        if (close>open){
            return 0;
        }
        if(curr==2*n){
            System.out.println(ans);
            return 1;
        }


        int count=print_brackets(n,curr+1,open+1,close,ans+" ( ")+
                print_brackets(n,curr+1,open,close+1,ans+" ) ");



        return count;
    }

}
