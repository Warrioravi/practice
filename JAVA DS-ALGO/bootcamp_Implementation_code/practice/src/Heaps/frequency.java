package Heaps;

import java.util.*;

public class frequency {
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
            else map.put(i,1);
        }
        PriorityQueue<pair> queue=new PriorityQueue<pair>(Comparator.comparing(pair -> pair.freq));
        for(int x:map.keySet()){
            queue.add(new pair(x,map.get(x)));
        }
        Stack<pair> s=new Stack<>();
        while(!queue.isEmpty()){
            s.push(queue.poll());
        }
        int index=0;
        while(!s.isEmpty()){
            pair curr=s.pop();
            for (int i = 0; i < curr.freq; i++) {
                arr[index]=curr.value;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
