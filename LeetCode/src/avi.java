import java.awt.datatransfer.StringSelection;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class avi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String key=s.nextLine();
        s.nextLine();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextLine();
        }
        int[] ans=new int[n];
        for (int i=0;i<n;i++) {
            String str=arr[i];
            String[] words=str.split(" ");
            for (String word:words) {
                if (word.equals(key)){
                    ans[i]++;
                }
            }

        }
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(ans[i],arr[i]);
        }
        Arrays.sort(ans);
        for (int i = 0; i < n; i++) {
            System.out.println(map.get(ans[i]));

        }

    }
}
