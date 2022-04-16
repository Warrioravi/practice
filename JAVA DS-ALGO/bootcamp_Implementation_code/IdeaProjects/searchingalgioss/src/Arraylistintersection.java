import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylistintersection {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int[] arr1=new int[input];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=s.nextInt();
        }
        int[] arr2=new int[input];
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i]=s.nextInt();
        }
        ArrayList<Integer> intersection=new ArrayList<>();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <input ; j++) {
                if (arr1[i]==arr2[j])
                {
                   if (!intersection.contains(arr1[i])){
                       intersection.add(arr1[i]);
                   }
                }


            }

        }
        Collections.sort(intersection);
        System.out.println(intersection);


        }
    }
