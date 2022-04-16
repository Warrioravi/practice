package nagarro_practice;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Hardwell {

    public static void main(String[] args) {
        int n=4;
        int[][] arr={{10,50},{100,200},{50,500},{123,789}};
        Arrays.sort(arr,((o1, o2) -> Math.abs(o1[0]-o1[1])<Math.abs(o2[1]-o2[0])?1:-1));
        System.out.println(Arrays.deepToString(arr));
        int least_sum=0;
        int countA=0,countB=0;

        for (int i = 1; i <=n ; i++) {
            if (countA<n/2&&countB<n/2){
                if (arr[i][0]<arr[i][1]){
                    countA++;
                    least_sum+=arr[i-1][0];

                }
                else {
                    countB++;
                    least_sum+=arr[i-1][1];
            }
            }
            else if (countA<n/2){
                countA++;
                least_sum+=arr[i-1][0];
            }
            else if (countB<n/2){
                countB++;
                least_sum+=arr[i-1][1];
            }
        }
        System.out.println(least_sum);


    }


}

