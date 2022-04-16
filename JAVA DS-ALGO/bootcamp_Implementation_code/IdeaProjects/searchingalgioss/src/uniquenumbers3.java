import java.util.Scanner;

public class uniquenumbers3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int[] arr=new int[input];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(unique3(arr));



    }
    public static int unique3(int arr[]){
        int[] count=new int[64];
        for (int i = 0; i < arr.length; i++) {
            int pos=0;
            int no=arr[i];
            while(no!= 0){
                count[pos]+=(no&1);
                pos++;
                no=no>>1;
            }

        }
        int power=1;
        int ans=0;
        for (int i = 0; i < count.length; i++) {
           count[i]%=3;
           ans+=count[i]*power;
           power*=2;
        }
       return ans;
    }
}
