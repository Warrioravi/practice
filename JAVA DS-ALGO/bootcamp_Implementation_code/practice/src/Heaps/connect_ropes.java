package Heaps;

import java.util.PriorityQueue;

public class connect_ropes {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        int cost=0;
        for (int i = 0; i <arr.length; i++) {
             queue.add(arr[i]);
        }
        while(queue.size()>=2){
            int first=queue.poll();
            int second=queue.poll();
            cost=first+second;
            queue.add(cost);
        }
        System.out.println(cost);
    }
}
