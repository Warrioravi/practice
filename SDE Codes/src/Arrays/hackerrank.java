package Arrays;

import javafx.util.Pair;

import java.util.Collections;
import java.util.PriorityQueue;

public class hackerrank {
    public static void main(String[] args) {
        System.out.println(64&512);
        Pair<Integer,Integer> p=new Pair<>(10,5);
        Pair<Integer,Integer> p2=new Pair<>(15,45);
        PriorityQueue<Pair<Integer,Integer>> Q=new PriorityQueue<>();
        Q.add(new Pair<>(12,13));
        Q.add(new Pair<>(7,14));
        Q.add(new Pair<>(89,111));
        Q.add(p);
        Q.add(p2);
        while(!Q.isEmpty()){
            System.out.println(Q.poll().getKey());
        }
    }



}
