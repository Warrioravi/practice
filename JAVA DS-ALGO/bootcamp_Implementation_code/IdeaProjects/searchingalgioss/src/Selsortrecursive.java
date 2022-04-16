import java.util.Scanner;

public class Selsortrecursive {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int [] arr=new int[input];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
