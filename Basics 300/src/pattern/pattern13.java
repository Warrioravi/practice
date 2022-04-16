package pattern;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int i = 0; i <n ; i++) {
            int ele=1;

            for (int j = 0;j <=i ; j++) {
                System.out.print(ele+"\t");
                ele=ele*(i-j)/(j+1);

            }
            System.out.println();
        }
    }
}
