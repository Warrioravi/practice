package DP_unbounded_KP_;

public class UBOUNDED_Kack {
        public static void main(String[] args) {
            int[] wt={1,2,3,5};
            int[] val={40,20,30,100};
            int capacity=7;
            int TDans=KP_TopDown(wt,val,capacity);
            System.out.println("Top-Down approach:"+TDans);
        }
        public static int  KP_TopDown(int []wt,int[] val,int capacity){
            int[][] dp=new int[wt.length+1][capacity+1];
            for (int i = 0; i <=wt.length; i++) {
                dp[i][0]=0;

            }
            for (int j = 1; j <=capacity ; j++) {
                dp[0][j]=0;
            }
            for (int i = 1; i <=wt.length; i++) {
                for (int j = 0; j <=capacity ; j++) {
                    if (j>=wt[i-1]){
                        dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                    }
                    else dp[i][j]=dp[i-1][j];
                }

            }
            return dp[wt.length][capacity];

        }

    }


