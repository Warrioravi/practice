import java.util.Scanner;

public class chewbacca {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long input=s.nextLong();
        long min_possible_number=0;
        long i=1;
        while (input>0){
            int rem=(int)input%10;
            if (rem>=5&&rem<=9)
            {
                rem=9-rem;
            }

            min_possible_number+=rem*i;
            i=i*10;
            input=input/10;

        }
        System.out.println(min_possible_number);

    }
}
