package recursion;

public class multiplication {
    public static void main(String[] args) {
        System.out.println(multiply(5,6));
    }
    public static int multiply(int a,int b){
        if(b==1){
             return a;
        }
        return a+multiply(a,b-1);
    }
}
