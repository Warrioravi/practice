package nagarro_practice;

import java.util.Scanner;

public class character_frequency_with_order {
    static final int SIZE = 26;

    static void printCharWithFreq(String str)
    {
        int n = str.length();


        int[] freq = new int[256];


        for (int i = 0; i < n; i++)
            freq[str.charAt(i)]++;

        for (int i = 0; i < n; i++) {

            if (freq[str.charAt(i)] != 0) {
                System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i)] + " ");
                freq[str.charAt(i) ] = 0;
            }
        }
    }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str =s.nextLine();
        printCharWithFreq(str);
    }
}
