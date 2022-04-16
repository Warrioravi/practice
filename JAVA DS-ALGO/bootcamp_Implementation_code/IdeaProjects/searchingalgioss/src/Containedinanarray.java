import java.util.ArrayList;
import java.util.Scanner;

public class Containedinanarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int[] arr = new int[input];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        doescontains(arr,0,target,list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");

        }

    }
    public static void doescontains(int[] arr,int start,int target,ArrayList<Integer> list){
        if (arr[start]==target){
            list.add(start);
        }
        if (start==arr.length-1)
        {
            return;
        }
        doescontains(arr,start+1,target,list);
        return;

    }
}
