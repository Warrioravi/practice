import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NewtonContest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] nums = br.readLine().split(" ");
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(nums[i]);
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println(ValidAns(arr,n));


    }

    public static int ValidAns(int arr[], int n) {
        int out = 1;
        for (int i = 0; i < n && arr[i] <= out; i++) {
            out = out + arr[i];
        }
        return out;
    }
}
