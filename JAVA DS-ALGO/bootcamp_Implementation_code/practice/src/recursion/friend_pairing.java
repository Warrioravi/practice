package recursion;

public class friend_pairing {
    public static void main(String[] args) {
        System.out.println(findWays(5));
    }
    public static int findWays(int n){
        if (n==0){
            return 1;
        }
        if (n<0){
            return 0;
        }
        int ways;
        ways=1*findWays(n-1)+(n-1)*findWays(n-2);
        return ways;

    }
}
