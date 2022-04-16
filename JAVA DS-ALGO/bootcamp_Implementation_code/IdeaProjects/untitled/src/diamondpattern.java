import java.util.Scanner;

public class diamondpattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int input=s.nextInt();
        int row=1,col;
        int space=input/2;
        int stars=1;
        //for upper half
        while (row<=input/2+1){
            col=1;
            while(col<=space)
            {
                System.out.print(" "+"\t");
                col++;
            }
            col=1;
            while (col<=stars){
                System.out.print("*"+"\t");
                col++;
            }
            space=space-1;
            stars=stars+2;
            row++;
            System.out.println();

        }
        //for lowerhalf
        space=1;
        row=1;
        stars=input-2;
        while (row<=input/2)
        {
            col=1;
            while(col<=space)
            {
                System.out.print(" "+"\t");
                col++;
            }
            col=1;
            while (col<=stars){
                System.out.print("*"+"\t");
                col++;
            }
            space=space+1;
            stars=stars-2;
            row++;
            System.out.println();

        }
    }
}
