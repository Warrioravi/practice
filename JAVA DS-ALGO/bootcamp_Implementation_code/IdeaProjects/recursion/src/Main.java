public class Main {
    public static void main(String[] args) {
        int a=10;
        pd(a);
    }

    public static void pd(int x) {
        if (x==0){
            return;
        }
        System.out.println(x);
        pd(x-1);



    }
}
