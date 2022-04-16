package LCS;
public class

longestSubsequence{
    public static void main(String[] args) {
        String s1="acbcf";
        String s2="abcdaf";
        System.out.println(longestcommonsubsequence(s1,s2,s1.length(),s2.length()));
       System.out.println(LCSubsequence(s1,s2));
    }
    public static int longestcommonsubsequence(String s1,String s2,int m,int n){
        if (m==0||n==0){
            return 0;
        }
        if (s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+longestcommonsubsequence(s1,s2,m-1,n-1);
        }
        else {
            return Math.max(longestcommonsubsequence(s1,s2,m-1,n),longestcommonsubsequence(s1,s2,m,n-1));
        }
    }
    public static int LCSubsequence(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <=n ; j++) {
                if (i==0||j==0){
                    dp[i][j]=0;
                }
                else if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);

            }
        }
        int i=m,j=n;
        StringBuilder res= new StringBuilder();
        while (i>0&&j>0){
            if (s1.charAt(i-1)==s2.charAt(j-1)){
                res.append(s1.charAt(i - 1));
                i--;
                j--;
            }
            else {
                if (dp[i-1][j]<dp[i][j-1]){
                    j--;
                }
                else {
                    i--;
                }
            }
        }
        System.out.println(res.reverse());
        return dp[m][n];
    }
}
