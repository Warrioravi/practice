import java.util.Scanner;

public class fahrenheittocelcius {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int minfahrenheit=s.nextInt();
        int maxfahrenheit=s.nextInt();
        int step=s.nextInt();
        int celcius;
        int temp=minfahrenheit;
        while(temp<=maxfahrenheit){
            System.out.print(temp+"\t");
            celcius=((temp - 32)*5)/9;
            System.out.println(celcius);
            temp+=step;
        }

    }
}
