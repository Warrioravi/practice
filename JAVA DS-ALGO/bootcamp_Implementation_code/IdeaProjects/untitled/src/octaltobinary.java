import java.util.Scanner;

public class octaltobinary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int octal = s.nextInt();
        long binary = convertOctalToBinary(octal);
        System.out.print(binary);
    }

    public static long convertOctalToBinary(int octalNumber) {
        int decimalNumber = 0, i = 0;
        long binaryNumber = 0;

        while (octalNumber != 0) {
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            ++i;
            octalNumber /= 10;
        }

        i = 1;

        while (decimalNumber != 0) {
            binaryNumber += (decimalNumber % 2) * i;
            decimalNumber /= 2;
            i *= 10;
        }

        return binaryNumber;
    }
}
