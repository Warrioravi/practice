package nagarro_practice;

public class Stockselling_single {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(calculatemax(arr));

    }
        public static int calculatemax(int arr[]) {
            int min = Integer.MAX_VALUE;
            int profit = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min)
                    min = arr[i];
                else if (arr[i] - min > profit)
                    profit = arr[i] - min;
            }
            return profit;
        }

}
