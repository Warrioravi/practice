import java.util.Scanner;

public class fibonnacitriangle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int input=s.nextInt();
        int first=0,second=1;
        int next=second;
        System.out.println(first);
        System.out.print(second+"\t");
        System.out.println(next+"\t");
        first=second;
        second=next;
        next=first+second;
        int row=3;
        while (row<=input){
            int col=1;
            while(col<=row){
                System.out.print(next+"\t");
                first=second;
                second=next;
                next=first+second;
                col++;


            }
            row++;
            System.out.println();
        }
    }
}
