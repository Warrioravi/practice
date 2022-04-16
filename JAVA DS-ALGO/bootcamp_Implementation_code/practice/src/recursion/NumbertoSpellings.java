package recursion;

public class NumbertoSpellings {
    public static void main(String[] args) {
        printspelling(123456);

    }
    public static void printspelling(int n){
        if (n==0){
            return;
        }
        printspelling(n/10);
        int curr=n%10;
        System.out.print(printDigit(curr)+" ");
        return;
    }
    public static String printDigit(int i){
        String[] arr={"zerp","one","two","three","four","five","six","seven","eight","nine"};
        return arr[i];
    }
}
