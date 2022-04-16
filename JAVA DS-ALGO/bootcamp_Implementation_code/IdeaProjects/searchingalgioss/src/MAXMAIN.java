import java.util.Scanner;

public class MAXMAIN {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long input=s.nextLong();
        long[] arr=new long[(int)input];
        long min=   Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;
        for (int i = 0; i <input ; i++) {
            arr[i]=s.nextLong();
            if(arr[i]>=max){
                max=arr[i];
            }
            if(arr[i]<=min){
                min=arr[i];
            }


        }
        System.out.println(max+" "+min);
    }
}
