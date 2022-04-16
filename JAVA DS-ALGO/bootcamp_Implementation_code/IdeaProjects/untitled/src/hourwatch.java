import java.util.Scanner;

public class hourwatch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int num=input;
        int start;
        int row=1,spaces=0;
        while(row<=input){
            //printing spaces
            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");

            }
            //printing firsthalf
            start=num;
            for (int i = 0; i <num ; i++) {
                System.out.print(start--);
                System.out.print(" ");

            }
            //printing middle zero
            System.out.print(0);
            System.out.print(" ");
            //printing secondhalf
            start=1;
            for (int i = 0; i <num ; i++) {
                System.out.print(start++);
                System.out.print(" ");

            }
            row++;
            num--;
            spaces++;
            System.out.println();
        }
        for (int i = 0; i < spaces; i++) {
            System.out.print("  ");

        }

        System.out.println(0);
        //printing lowerhalf
        row=1;
        spaces=input-1;
        while(row<=input){
            //printing spaces
            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");

            }
            //printing firsthalf
            start=row;
            for (int i = 0; i <row ; i++) {
                System.out.print(start--);
                System.out.print(" ");

            }
            //printing middle zero
            System.out.print(0);
            System.out.print(" ");
            //printing secondhalf
            start=1;
            for (int i = 0; i <row ; i++) {
                System.out.print(start++);
                System.out.print(" ");

            }
            row++;

            spaces--;
            System.out.println();
        }
    }
}
