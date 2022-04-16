package recursion;

public class power {
    public static void main(String[] args) {
        System.out.println(mathpower(5,2));
    }
    public static int mathpower(int a, int b){
        if(b==1){
            return a;
        }
        return a*mathpower(a,b-1);

    }
}
