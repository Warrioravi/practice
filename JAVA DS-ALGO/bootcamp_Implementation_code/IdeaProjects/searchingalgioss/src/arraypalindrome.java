import java.util.Scanner;

public class arraypalindrome {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int input=s.nextInt();
       int[] arr=new int[input];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();

        }


        System.out.println(ispalindrome(arr,0,arr.length-1));

    }
    public static boolean ispalindrome(int[] arr,int start,int end){
        if (start>=end) {
            return true;
        }
        if (arr[start]==arr[end]){
            return (ispalindrome(arr,start+1,end-1));
        }

        return false;

    }
}
