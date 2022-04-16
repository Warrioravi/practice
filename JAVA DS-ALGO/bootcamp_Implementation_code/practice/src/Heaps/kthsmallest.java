package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthsmallest {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15};
        int k=3;
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
            if (q.size()>k){
                q.poll();
            }
        }
        System.out.println(q.poll());
    }
}