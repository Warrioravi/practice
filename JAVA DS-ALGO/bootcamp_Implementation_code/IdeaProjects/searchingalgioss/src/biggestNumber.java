import java.util.Scanner;

public class biggestNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t>0) {
            long input = s.nextLong();
            long[] arr = new long[(int) input];
            for (int i = 0; i < input; i++) {
                arr[i] = s.nextInt();
            }
            bblesort(arr);
            String output = "";
            for (int i = 0; i < arr.length; i++) {
                output += arr[i] + "";
            }
            System.out.println(output);
            t--;
        }

    }
    public static int compareTo(long first,long second){
        String fps=first+""+second;
        String spf= second+""+first;
        long fpsval=Long.valueOf(fps);
        long spfval=Long.valueOf(spf);
        if(fpsval>spfval){
            return -1;
        }
        else
        {
            return 1;
        }
    }
    public static void bblesort(long[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (compareTo(arr[j],arr[j+1])>0)
                {
                    long temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
