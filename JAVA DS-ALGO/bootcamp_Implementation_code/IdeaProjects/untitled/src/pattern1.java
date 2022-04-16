import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int row=1;

        while(row<=input){
            int col=1;
            if (row==1)
            {
                  System.out.print(1);

            }
            else {
                while (col <= row) {
                    if (col == 1 || col == row) {
                        System.out.print(row-1);
                        col++;

                    }
                    else{
                        System.out.print(0);
                        col++;
                    }
                }
            }
            row++;
            System.out.println();
        }

    }
}
