package recursion;

import java.util.Scanner;

public class kickstart{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int test=s.nextInt();
        while(test>0){
            int n=s.nextInt();
            int k=s.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            System.out.println(findCountdown(arr,n,k));
            test--;
        }
    }
    public static int findCountdown(int[] arr,int n ,int k){
        int i=0,j=(i+k-1);
        int count=0;

        while(j<n){
            if((i==k)&&(j==1)){
                for(int c=i;c<j;c++){
                    if(arr[c]!=(arr[c+1]+1)){
                        break;
                    }
                    if(c==j){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}