import java.util.Scanner;

public class r3pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input=s.nextInt();
        int row=1;
        while (row<input){
            int col=1;
            while (col<=row){
                System.out.print("*");
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
