import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        long input=s.nextInt();
        int[] arr=new int[input];
        for (long i = 0; i < input; i++) {
            arr[i]=s.nextLong();
        }
        int target=s.nextInt();
    }
}
