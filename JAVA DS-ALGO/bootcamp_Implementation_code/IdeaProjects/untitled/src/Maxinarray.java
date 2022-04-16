import java.util.Scanner;

public class Maxinarray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int input=s.nextInt();
        long[] arr=new long[input];
        long  max=-1000000000;
        for (int i = 0; i < input; i++) {
            arr[i]=s.nextLong();
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);


    }
}
