package arrays;

import java.util.Scanner;

public class rotateArray {
    public static void rotate(int[] a, int k) {
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);

    }

    // Don't make any changes here
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k=s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        rotate(ar, k);
        for (int v : ar)
            System.out.print(v + " ");
    }
    public static void reverse(int[] a,int start,int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }


}
