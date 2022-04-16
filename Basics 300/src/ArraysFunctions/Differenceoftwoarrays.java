package ArraysFunctions;

import java.util.Scanner;

public class Differenceoftwoarrays {
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
        int[] diff=new int[n2];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=diff.length-1;

        int carry=0;
        while(k>=0){

            int a1val= i>=0? arr1[i]:0;
            if(arr2[j]+carry>=a1val){
              diff[k]=arr2[j]+carry-a1val;
              carry=0;
            }
            else{
                diff[k]=arr2[j]+carry+10-a1val;
                carry=-1;
            }

            i--;
            j--;
            k--;
        }
        int index=0;
        while (index<diff.length){
            if(diff[index]==0){
                index++;
            }
            else break;
        }
        for (int l = index; l <diff.length ; l++) {
            System.out.println(diff[l]);
        }

    }
}
