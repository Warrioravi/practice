import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap {
    static class pair{
        int value;
        int difference;
        pair(int value,int difference){
            this.value=value;
            this.difference=difference;
        }
    }

    public static void main(String[] args) {
        pair [] arr=new pair[3];
        arr[0]=new pair(0,1);
        arr[1]=new pair(3,-4);
        arr[2]=new pair(2,8);
        Arrays.sort(arr,Comparator.comparing(pair -> pair.difference));
        for (pair p:arr) {
            System.out.println(p.difference);

        }

        System.out.println(Arrays.deepToString(arr));
    }
    public static void Ksorted(int[] arr, int x, int k){
        PriorityQueue<pair> queue=new PriorityQueue<pair>(Comparator.comparing(pair -> pair.difference));
        for (int i = 0; i < arr.length; i++) {
            queue.add(new pair(arr[i],Math.abs(x-arr[i])));
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(queue.poll().value);
        }


    }


}
