import java.util.Scanner;

public class sumoftwoarr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int[] array1=new int[m];
        for (int i = 0; i < m; i++) {
            array1[i]=s.nextInt();
        }
        int n=s.nextInt();
        int[] array2=new int[n];
        for (int i = 0; i<n; i++) {
            array1[i]=s.nextInt();
        }
        int sum,num1=0,num2=0,mul=1;
        for (int i =m-1; i >=0; i--) {
            num1+=array1[i]*mul;
            mul=mul*10;


        }
        mul=1;
        for (int i =n-1; i >=0; i--) {
            num2+=array2[i]*mul;
            mul=mul*10;
        }
        sum=num1+num2;
        System.out.println(sum);

    }
}
