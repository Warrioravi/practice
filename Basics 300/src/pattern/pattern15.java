package pattern;

import java.util.Scanner;

public class pattern15 {


        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n=scn.nextInt();
            int spaces=n/2;
            int nums=1;
            int starting=1;


            for(int i=1;i<=n;i++){
                for(int j=1;j<=spaces;j++){
                    System.out.print("\t");
                }
                int value=starting;
                for(int j=1;j<=nums;j++){
                    System.out.print(value+"\t");
                    if(j<=nums/2){
                        value++;
                    }
                    else{
                        value--;
                    }
                }





                if(i<=n/2){
                    spaces--;
                    nums+=2;
                    starting++;
                }
                else{
                    spaces++;
                    nums-=2;
                    starting--;
                }
                System.out.println();



            }

        }

}
