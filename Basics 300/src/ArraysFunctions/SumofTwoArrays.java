package ArraysFunctions;

import java.util.Scanner;

public class SumofTwoArrays {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=s.nextInt();
        }
        int n2=s.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=s.nextInt();
        }
        int[] sum=new int[Math.max(n1,n2)];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;

        int carry=0;
        while(k>=0){
            int d=0;
            if(i>=0){
               d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            d+=carry;
            sum[k]=d%10;
            carry=d/10;
            i--;
            j--;
            k--;
        }
        if (carry!=0){
            System.out.println(carry);
        }
        for (int value: sum) {
            System.out.println(value);
        }


    }
}
