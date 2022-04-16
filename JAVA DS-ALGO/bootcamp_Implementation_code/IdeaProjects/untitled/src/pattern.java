import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int row = 1;
        while (row <= input) {
            int col = 1;
            while (col <= row) {
                if (row % 2 == 0) {
                    if (col == 1 || col == row) {
                        System.out.print(1);
                        col++;

                    }
                    else {
                        System.out.print(0);
                        col++;

                    }
                }
                else {
                    System.out.print(1);
                    col++;
                }
            }
            row++;
            System.out.println();
        }
    }
}