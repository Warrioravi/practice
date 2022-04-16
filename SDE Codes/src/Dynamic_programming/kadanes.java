package Dynamic_programming;

public class kadanes {
    public static int maxsubarray(int[] arr) {
        int maxH = arr[0];
        int maxTillnow = arr[0];
        for(int i=1;i<arr.length;i++){
            maxH = Math.max(arr[i], maxH+arr[i]);
            maxTillnow = Math.max(maxTillnow,maxH);
        }
        return maxTillnow;
    }

    public static void main(String[] args) {
        int [] arr={-4,-8,-1,-2,-5,-6,-5,-5};
        System.out.println(maxsubarray(arr));
    }
    static void maxSubArraySum(int a[], int size)
    {
        int total_sum = Integer.MIN_VALUE,
                maxhere = 0,low = 0,
                high = 0, s = 0;

        for (int i = 0; i < size; i++)
        {
            maxhere += a[i];
            if (total_sum < maxhere)
            {
                total_sum = maxhere;
                low = s;
                high = i;
            }

            if (maxhere < 0)
            {
                maxhere = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum contiguous sum is "
                + total_sum);
        System.out.println("Starting index " + low);
        System.out.println("Ending index " + high);
    }
}
