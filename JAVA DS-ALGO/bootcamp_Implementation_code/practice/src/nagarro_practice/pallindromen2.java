package nagarro_practice;

public class pallindromen2 {
    public static void main(String[] args) {
        String s="abc";
        if (s.length()==1){
            System.out.println(s+"length:1");
            return;
        }
        int n=s.length();
        String ans="";
        for (int i = 0; i < n; i++) {
            String longest=expand(s,i,i);
            if (longest.length()>ans.length()){
                ans=longest;
            }
            String longest2=expand(s,i,i+1);
            if (longest2.length()>ans.length()){
                ans=longest2;
            }
        }
        System.out.println(ans);
    }
    public static String expand(String s,int left,int right){
        while (left>=0&&right<=s.length()-1&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }



}
