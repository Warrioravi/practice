package arrays;

import java.util.Scanner;

public class AllSubsets {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=s.nextInt();
        }
        //no. of subsets of a array is 2^n where n is length of the array
        int noSubsets=(int)Math.pow(2,n);
        for (int i = 0; i <noSubsets ; i++) {
            int curr=dectoBinary(i);
            int index=n-1;
            String ans="";
            while(index>=0){
                if(curr%10==1){
                    ans=arr[index]+"\t"+ans;
                }
                else{
                    ans="-"+"\t"+ans;
                }
                curr=curr/10;
                index--;
            }
            System.out.println(ans);

        }

    }
    public static int dectoBinary(int n){
        int ans=0;
        int power=1;
        while(n>0){
            int rem=n%2;
            ans+=(rem*power);
            n=n/2;
            power*=10;
        }
        return ans;
    }
}
