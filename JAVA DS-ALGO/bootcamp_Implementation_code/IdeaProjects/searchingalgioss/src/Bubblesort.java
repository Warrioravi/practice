import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int[] arr=new int[input];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=s.nextInt();
        }
       insertion_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

    public static void selection_sort(int[] arr){
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min=i;
            for (int j = i+1; j<arr.length; j++) {
                if(arr[j]<arr[min]){
                        min=j;

                }


                }
            swap(arr,i,min);
                
            }
                    
        }
        public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        }
        public static void insertion_sort(int[] arr){
            for (int i = 1; i < arr.length; i++) {
                for (int j = i; ((j>0) &&arr[j]<arr[j-1]) ; j--) {
                    swap(arr,j,j-1);

                }
            }
        }
    }

