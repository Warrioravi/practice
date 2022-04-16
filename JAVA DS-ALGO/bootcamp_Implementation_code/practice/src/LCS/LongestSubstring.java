package LCS;

public class LongestSubstring {
    public static void main(String[] args) {
        String s1="abcefabbbbc";
        String s2="abcdddabcdd";
        System.out.println(longestcommonsubstring(s1.toCharArray(),s2.toCharArray()));
        System.out.println(LCSubstring(s1,s2));
    }
    public static int lcs(char[] A, char[] B, int m, int n, int res) {
        if (m == -1 || n == -1) {
            return res;
        }
        if (A[m] == B[n]) {
            res = lcs(A, B, m - 1, n - 1, res + 1);
        }
        return Math.max(res, Math.max(lcs(A, B, m, n - 1, 0), lcs(A, B, m - 1, n, 0)));
    }

    public  static int longestcommonsubstring(char[] A, char[] B) {
        return lcs(A, B, A.length - 1, B.length - 1, 0);
    }
    public static int LCSubstring(String s1,String s2){
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        int result=0;
        for (int i = 0; i <=s1.length() ; i++) {
            for (int j = 0; j <=s2.length() ; j++) {
                if (i==0||j==0){
                    dp[i][j]=0;
                }
                else if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    result=Math.max(result,dp[i][j]);
                }
                else dp[i][j]=0;
            }

        }
        return result;







    }
}
