package recursion;

public class wine_problem {
    public static void main(String[] args) {
        int arr[]={2,3,5,1,4};
        System.out.println(solve(arr,0,arr.length-1,1));
    }
    public static int solve(int[] pricelist,int start,int end,int day){
        if (start==end){
            return day*pricelist[start];
        }
        if (start>end){
            return 0;
        }
        return Math.max(solve(pricelist,start+1,end,day+1)+pricelist[start]*day,
                solve(pricelist,start,end-1,day+1)+day*pricelist[end]);

    }
}
