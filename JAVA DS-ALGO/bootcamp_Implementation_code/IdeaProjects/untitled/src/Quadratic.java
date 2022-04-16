import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        double root1=0,root2=0;
        double d=(int)Math.pow(b,2)-4*a*c;
        double sqrt=(int)Math.sqrt(d);
        if (d>0){
            System.out.println("Real and Distinct");
            root1=(int)(-b+sqrt)/2*a;
            root2=(int)(-b-sqrt)/2*a;
            System.out.println(root2+" "+root1);



        }
        else if (d==0){
            System.out.println("Real and Equal");
            root1=root2=(int)(-b)/2-a;

        }
        else{
            System.out.println("Imaginary");

        }


    }
}
