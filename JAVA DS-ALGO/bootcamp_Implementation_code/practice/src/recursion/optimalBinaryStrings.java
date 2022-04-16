package recursion;

public class optimalBinaryStrings
{
    public static void main(String[] args) {
        System.out.println(countOptimal(3));
    }

    public static int countOptimal(int n){
        if (n==1){
            return 2;
        }
        if(n==2){
            return 3;
        }
        int count=countOptimal(n-1)+countOptimal(n-2);






        return count;
    }
}
