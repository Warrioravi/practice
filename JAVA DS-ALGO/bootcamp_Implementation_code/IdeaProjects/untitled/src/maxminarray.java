import java.util.Scanner;

public class maxminarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] arr=new int[size];
        int min,max;

        for (int i = 0; i < size; i++) {
            arr[i]=s.nextInt();


        }
        min=max=arr[0];
        for (int i = 0; i < size; i++) {
           if( arr[i]>max) {
               max = arr[i];
           }
           if(arr[i]<min){
               min=arr[i];
           }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
