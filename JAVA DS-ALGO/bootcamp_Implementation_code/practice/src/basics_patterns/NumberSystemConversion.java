package basics_patterns;

public class NumberSystemConversion {
    public static void main(String[] args) {
        int  binary=111000;
        String s=String.valueOf(binary);
        int decimal=0;
        int power=0;
        while(binary>0) {
            int rem = binary % 10;
            if (rem == 1) {
                decimal +=Math.pow(2,power);

            }
            power++;
            binary=binary /10;
        }
        System.out.println(decimal);
        //using parseInt

        System.out.println("Using parseInt "+Integer.parseInt(s,2));
    }

}


