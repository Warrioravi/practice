package Codesule;

import java.util.*;

public class viratandmonk {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                arr[j]+=s.nextInt();
            }
        }

        TreeSet<Integer> container=new TreeSet<>();
        for (int i = 0; i <n; i++) {
            container.add(arr[i]);
        }
        int queries=s.nextInt();
        for (int i = 0; i < queries; i++) {
            int k=s.nextInt();
            if (k>container.size()){
                System.out.println(-1);
                continue;
            }
            int count=0;
            for (int a:container) {
                count++;
                if (count==k){


                    System.out.println(a);
                    container.remove(a);
                    break;
                }
            }

        }

    }
}
//alternative approach


