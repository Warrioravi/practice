package recursion.Introduction;

import java.util.Scanner;

public class towerOfHanoi {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        toh(n,n1,n2,n3);
    }

    public static void toh(int n, int source, int dest, int aux){
        if(n==0){
            return;
        }
        //move n-1 disks from source to aux using dest
        //move nth disk from source to dest
        //move n-1 disks from
        toh(n-1,source,aux,dest);
        System.out.println(n+"["+source+" -> "+dest+"]");
        toh(n-1,aux,dest,source);
    }
}
