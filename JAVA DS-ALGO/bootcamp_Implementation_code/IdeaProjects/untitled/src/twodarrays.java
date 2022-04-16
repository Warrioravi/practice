import java.util.ArrayList;

public class twodarrays {
    public static void main(String[] args) {
      //  int[][] arr;
      //  arr=new int[4][3];
      //  System.out.println(arr.length);
       // System.out.println(arr[0].length);
       // display (arr);

        ArrayList<Integer> list=new ArrayList<>();

        System.out.println(list.size());
        list.add(4);
        list.add(10);
        list.add(90);
        System.out.println(list.size());
    }

    public static void display(int[][] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
}
