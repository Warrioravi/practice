import java.util.Scanner;

public class PatternNumberLadder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int count=1;
        int row=1;
        while(row<=input){
            int col=1;
            while(col<=row){
                System.out.print(count+"\t");
                count++;
                col++;
            }
            System.out.println();
            row++;
        }

    }
}
