package MaximumSubarrayProblem;

public class max_subarray {
    public static void main(String[] args) {
        int [] arr={-6,-5,-6,-4,-8,-2,-7,-6,-3,-9};
        //max_Sub_bruteforce(arr);
      //int x= max_Sub_Divide_n_Conquer(arr,0,arr.length-1);
        System.out.println(maxSubArraySum(arr));
        DP(arr);
        //DP(arr);
        //System.out.println(x);
    }
    public static void max_Sub_bruteforce(int[] arr){
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j <arr.length ; j++) {
                sum+=arr[j];
                if (max<sum){
                    max=sum;
                }

            }
        }
        System.out.println(max);
    }
    public static  int max_Sub_Divide_n_Conquer(int[] arr,int left,int right){
        if (left==right){
            return arr[left];
        }
        int mid=(left+right)/2;
        int leftsum=max_Sub_Divide_n_Conquer(arr,left,mid-1);
        int rightsum=max_Sub_Divide_n_Conquer(arr,mid+1,right);
        return (Math.max(max_crossing_mid(arr,left,mid,right),Math.max(leftsum,rightsum)));





        }
        public static  int max_crossing_mid(int[] arr, int left,int mid,int right){
        int lsum=Integer.MIN_VALUE;
        int rsum=Integer.MAX_VALUE;
        int sum=0;
        //left traversal
            for (int i = mid; i >=left ; i--) {
                sum += arr[i];
                if (sum > lsum) {
                    lsum = sum;
                }
            }

         //right traversal
            sum=0;
            for (int i = mid; i<=right; i++) {
                sum+=arr[i];
                if(sum>rsum){
                    rsum=sum;
                }
            }





        return Math.max(Math.max(lsum,rsum),lsum+rsum-arr[mid]);
        }





    public static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
    public static void DP(int[] arr){
        int curr=arr[0];
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr=Math.max(arr[i],curr+arr[i]);
            max=Math.max(max,curr);
        }
        System.out.println(max);

    }
}
