package recursion;

public class tiling_problem {
    public static void main(String[] args) {
        int ans=countways(4);
        System.out.println(ans);
    }
    public static int countways(int n){
        if (n<4){
            return 1;
        }
        if(n==0){
            return 1;
        }
        int ways;
        ways=countways(n-1)+countways(n-4);
        return  ways;
    }

}
