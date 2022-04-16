import java.util.Scanner;

public class arrayrotation {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[][] arr= new int[n][n];
        int[][] rotated_arr=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]=s.nextInt();
                rotated_arr[j][i]=arr[i][j];

            }

        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(rotated_arr[i][j]);

            }
            System.out.println();

        }
    }
}
