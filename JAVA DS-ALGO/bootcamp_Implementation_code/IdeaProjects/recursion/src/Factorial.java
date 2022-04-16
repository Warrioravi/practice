public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int x){
        int fac;
        if (x==1)
            return 1 ;
        fac=fact(x-1)*x;
        return fac;

    }
}
