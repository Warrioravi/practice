import java.util.Scanner;

public class oddevensum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int oddsum=0,evensum=0,count=1;
        while(input>0){
            if(count%2==1) {
                oddsum += input % 10;
                input = input / 10;
                count++;
            }
            else{
                evensum+=input%10;
                input=input/10;
                count++;

            }

        }
        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
