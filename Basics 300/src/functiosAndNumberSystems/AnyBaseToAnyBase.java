package functiosAndNumberSystems;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int sourcetoDecimal=AnyBaseToDecimal.getValueIndecimal(n,sourceBase);
        int destbaseAns=DecimalToAnyBase.getValueInBase(sourcetoDecimal,destBase);
        System.out.println(destbaseAns);
    }
}
