package recursion;

import java.util.HashMap;

public class Edit_distance {
    public static void main(String[] args) {
        String s1="sunday";
        String s2="saturday";
        System.out.println(Distance(s1,s2));
    }
    static HashMap<String,Integer> map=new HashMap<>();
    public static int Distance(String s1,String s2) {
        if (map.containsKey(s1 + s2)) {
            return map.get(s1 + s2);
        }
        if (s1.length() == 0) {
            return s2.length();
        }
        if (s2.length() == 0) {
            return s1.length();
        }
        String ros1 = s1.substring(1);
        String ros2 = s2.substring(1);
        if (s1.charAt(0) == s2.charAt(0)) {
            return Distance(ros1, ros2);
        } else {
            int replace = 1 + Distance(ros1, ros2);
            int delete = 1 + Distance(ros1, s2);
            int add = 1 + Distance(s1, ros2);
            int ans = Math.min(replace, Math.min(delete, add));
            map.put(s1 + s2, ans);
            return ans;
        }
    }
        public int minDistance(String s1, String s2) {

            int [][]dp=new int[s1.length()+1][s2.length()+1];

            dp[s1.length()][s2.length()]=0;

            for(int i=s1.length();i>=0;i--)
            {
                for(int j=s2.length();j>=0;j--)
                {
                    if(i==s1.length())
                        dp[i][j]=s2.length()-j;

                    else if(j==s2.length())
                        dp[i][j]=s1.length()-i;

                    else if(s1.charAt(i)==s2.charAt(j))
                        dp[i][j]=dp[i+1][j+1];

                    else
                        dp[i][j]=1+Math.min(dp[i+1][j+1],Math.min(dp[i+1][j],dp[i][j+1]));
                }
            }
            return dp[0][0];

        }

    }

