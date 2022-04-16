package arrays;

import java.util.Scanner;

public class span {

        public static void main(String[] args) throws Exception {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int curr=s.nextInt();
                if(curr<min){
                    min=curr;;
                }
                if(curr>max){
                    max=curr;
                }
            }
            System.out.println(max-min);
        }


}
