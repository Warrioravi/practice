import java.util.Scanner;

public class factosum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int input=s.nextInt();
        int sum=0;
        while (input>0){
            int num=s.nextInt();
            int fact=1,start=1;
            while(start<=num){
                fact=fact*start;
                start++;
            }
            sum+=fact;
            input--;
        }
        System.out.println(sum%107);
    }
}
