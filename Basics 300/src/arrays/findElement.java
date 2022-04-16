package arrays;

import java.util.Scanner;

public class findElement {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int ans=-1;
        int d=s.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==d){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }

}
