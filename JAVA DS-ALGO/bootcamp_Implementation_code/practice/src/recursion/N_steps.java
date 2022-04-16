package recursion;

public class N_steps {
    public static void main(String[] args) {
        System.out.println(countways(4,3));
    }
    public static int countways(int n,int maxsteps){
        if (n==0){
            return 1;
        }
        if (n<0){
            return 0;
        }
        int ways=0;
        for (int i = 1; i <=2 ; i++) {
            ways+=countways(n-i,maxsteps);

        }
         return ways;
    }
}
