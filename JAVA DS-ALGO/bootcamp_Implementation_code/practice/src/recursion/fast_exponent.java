package recursion;

public class fast_exponent {
    public static void main(String[] args) {
        System.out.println(fastpower(5,5));
        System.out.println(fastpower(5,4));
    }
    public static int fastpower(int a,int b){
        if(b==1){
         return a;
        }
        int curr=fastpower(a, b/2);
        int ans;

        if ((b&1)==0){
            ans=curr*curr;
        }
        else {
            ans=a*curr*curr;
        }
        return ans;
    }
}
