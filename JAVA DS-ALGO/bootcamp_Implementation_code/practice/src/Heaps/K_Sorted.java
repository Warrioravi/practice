package Heaps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class K_Sorted {
    public static void main(String[] args) {
        int arr[]={6,5,3,2,8,10,9};
        int k=3;
        int index=0;
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for (int i = 0; i <arr.length; i++) {
            q.add(arr[i]);
            if (q.size()>k){
                arr[index++]=q.poll();
            }
        }
        Iterator<Integer> i=q.iterator();
        while (i.hasNext()){
            arr[index++]=q.poll();
        }
        System.out.println(Arrays.toString(arr));
    }
}
