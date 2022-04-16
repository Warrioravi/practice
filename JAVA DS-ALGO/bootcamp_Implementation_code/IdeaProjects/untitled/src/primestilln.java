import java.util.Scanner;

public class primestilln {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int input=s.nextInt();
        for (int i = 2; i <input ; i++) {
            int factors=0;
            for (int j = 2; j <i/2+1 ; j++) {
                if(i%j==0){
                    factors+=1;
                }

            }
            if (factors==0)
            {
                System.out.println(i);
            }
        }
    }
}
