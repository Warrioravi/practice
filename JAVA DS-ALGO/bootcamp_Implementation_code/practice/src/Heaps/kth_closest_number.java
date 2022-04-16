package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class kth_closest_number {
    static class pair{
        pair(int value,int difference){
            this.value=value;
            this.difference=difference;
        }
        int value;
        int difference;
    }

    public static void main(String[] args) {
        int[] arr={7,6,8,5,9};
        int x=7,k=3;
        PriorityQueue<pair> queue=new PriorityQueue<pair>(Comparator.comparing(pair -> pair.difference));
        for (int i = 0; i < arr.length; i++) {
            queue.add(new pair(arr[i],Math.abs(arr[i]-x)));
        }
        for (int i = 0; i < k; i++) {
            System.out.println(queue.poll().value);
        }
    }
}
