package ArraysFunctions;

public class Inverse {
    public static int[] inverse(int[] a){
        // write your code here
        int[] arr=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[a[i]]=i;
        }
        return arr;

    }
}
