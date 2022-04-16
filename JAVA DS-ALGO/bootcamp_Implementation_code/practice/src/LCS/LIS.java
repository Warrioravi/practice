package LCS;

public class LIS {
    public static void main(String[] args) {
        int[] arr={498,49,4,7,4,4,84,9,249,149,49,498,8};
            int[] ans=new int[arr.length];
            ans[0]=1;
            for (int i = 1; i < arr.length; i++) {
                ans[i]=1;
                for (int j = i-1; j >=0 ; j++) {
                   if (arr[j]>arr[i]){
                        continue;
                   }
                   int possible_ans=ans[i]+1;
                    {
                        if (possible_ans>ans[i]){
                            ans[i]=possible_ans;
                        }
                    }
                }
            }
            int best=0;
        for (int i = 0; i < ans.length; i++) {
            if (best<ans[i]){
                best=ans[i];
            }
        }
        }
}


