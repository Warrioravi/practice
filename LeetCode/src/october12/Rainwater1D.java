package october12;

public class Rainwater1D {

        public static int trap(int[] height) {
            int n=height.length;
            if(n==0){
                return 0;
            }
            int[] lefthigh=new int[n];
            int[] righthigh=new int[n];
            int max=height[0];
            for(int i=0;i<n;i++){
                max=Math.max(height[i],max);
                lefthigh[i]=max;
            }
            max=height[n-1];
            for(int i=n-1;i>=0;i--){
                max=Math.max(height[i],max);
                righthigh[i]=max;
            }
            int water=0;
            for(int i=0;i<n;i++){
                int currwater=Math.min(lefthigh[i],righthigh[i])-height[i];
                water+=currwater;
            }
            return water;

        }

}
