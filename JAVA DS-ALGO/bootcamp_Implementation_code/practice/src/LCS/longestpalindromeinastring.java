package LCS;

public class longestpalindromeinastring {
    public static void main(String[] args) {
        String str="forgeeksskeegfor";
        longest(str,0,str.length()-1);
       //boolean ans= ispalindrome("geegeeg");
        //System.out.println(ans);
    }
    public static void longest(String str,int start,int end){
        int max=1;
        String ans = null;

        for (int i = 0; i <=end; i++) {
            for (int j = end; j >=i ; j--) {
                String curr=str.substring(i,j+1);
                if (ispalindrome(curr)){
                    if ((j-i+1)>max){
                        ans=curr;
                        max=curr.length();
                        break;
                    }
                }

            }
        }
        System.out.println(ans);
    }
    public static boolean ispalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if (s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
}
