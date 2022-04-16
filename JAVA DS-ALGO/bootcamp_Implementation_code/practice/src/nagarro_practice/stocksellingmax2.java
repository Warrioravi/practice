package nagarro_practice;

public class stocksellingmax2 {
    public static void main(String[] args) {
        int[] arr={3,3,5,0,0,3,1,4};
        System.out.println(max(arr));
    }
    public static int max(int[] stocks) {
        if(stocks == null || stocks.length == 0) return 0;
        int fb = Integer.MIN_VALUE;
        int sb = Integer.MIN_VALUE;
        int fs = 0;
        int ss = 0;

        for(int i=0;i<stocks.length;i++){
            fb = Math.max(fb,-stocks[i]);
            fs = Math.max(fs,fb+stocks[i]);
            sb = Math.max(sb,fs-stocks[i]);
            ss = Math.max(ss,sb+stocks[i]);

        }
        return ss;
    }
}
