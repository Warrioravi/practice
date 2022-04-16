import java.util.Scanner;

public class ReursiveselectionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int[] arr=new int[input];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=s.nextInt();
        }
        recurSelectionSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
     public static void recurSelectionSort(int[] arr, int start , int end)
    {
        if (start == end) {
            return;
        }
        int min=miniIndex(arr,start,end);
        swap(arr,start,min);
        recurSelectionSort(arr, start+1, end);
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int miniIndex(int[] arr,int start,int end){
        int minimumindex=start;
        for (int i = start; i <arr.length ; i++) {
           if (arr[minimumindex]>arr[i])
           {
               minimumindex=i;
           }
        }
        return minimumindex;
    }
}
