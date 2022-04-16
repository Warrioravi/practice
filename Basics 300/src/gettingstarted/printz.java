package gettingstarted;

public class printz {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        int mid=n-1;
        for (int i = 0; i < n - 2; i++) {
            for (int col=1;col<=n;col++){
                if (col==mid){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            mid--;

        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
