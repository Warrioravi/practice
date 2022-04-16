import java.util.Scanner;

public class hollowdiamond {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int stars=input-1,space=1,row=1,col=1;
        while(row<=input){
            col=1;

            if (row==1){
                while(col<=input*2-1)
                {
                    System.out.print("*");
                    col++;
                }
                row++;
            }
            else {
                while (col <= stars) {
                    System.out.print("*");
                    col++;
                }
                col=1;
                while (col<=space){
                    System.out.print(" ");
                    col++;
                }
                col=1;
                while (col <= stars) {
                    System.out.print("*");
                    col++;
                }
                row++;
                space+=2;
                stars--;


            }

            System.out.println();

        }
        //for lower half
        row=1;
        space=space-4;
        stars=2;
        while(row<input){
            col=1;

            if (row==input-1){
                while(col<=input*2-1)
                {
                    System.out.print("*");
                    col++;
                }
                row++;
            }
            else {
                while (col <= stars) {
                    System.out.print("*");
                    col++;
                }
                col=1;
                while (col<=space){
                    System.out.print(" ");
                    col++;
                }
                col=1;
                while (col <= stars) {
                    System.out.print("*");
                    col++;
                }
                row++;
                space-=2;
                stars++;


            }

            System.out.println();

        }

    }
}
