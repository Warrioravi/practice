package arrays;

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            max= arr[i] > max ? arr[i] : max ;
        }
        for(int i=0;i<n;i++){
            arr[i]=max-arr[i];
        }
        for(int i=1;i<=max;i++){
            for(int j=0;j<n;j++){
                if(arr[j]==0){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                    arr[j]--;
                }
            }
            System.out.println();
        }


    }
}
