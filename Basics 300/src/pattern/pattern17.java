package pattern;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int spaces=n/2;
        int stars=1;
        for (int i = 1; i <= n; i++) {
                //printing spaces
                for (int j = 1; j <=n/2; j++) {
                    if (i == n / 2 + 1) {
                        System.out.print("*" + "\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
                //printing stars
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*"+"\t");
                }
                stars= i<=n/2 ? stars+1 : stars-1;
                System.out.println();

            }


        }
    }

