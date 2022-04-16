package Heaps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class kfrequent_numbers {
    static class pair{
        pair(int value,int freq){
            this.value=value;
            this.freq=freq;
        }
        int value;
        int freq;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,3,2,2,1,4,4,4,4};
        int k=3;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr) {
            if (map.containsKey(i)){
                int  val=map.get(i);
                map.put(i,val+1);
            }
            else map.put(arr[i],1);
        }
        PriorityQueue<pair> queue=new PriorityQueue<pair>(Comparator.comparing(pair -> pair.freq));
        for (HashMap.Entry m:map.entrySet()) {
            queue.add(new pair((int)m.getKey(), (int) m.getValue()));
            if (queue.size()>k){
                queue.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(queue.poll().value);
        }
    }
}
