package LCS;

public class swaptwoandthree {
    public static void main(String[] args) {
        String str="swap two and three in this string";
        String[] words=str.split(" ");
        StringBuilder res=new StringBuilder();
        for (String s:words) {
            if (s.equals("two")){
                res.append("three"+" ");
            }
            else if (s.equals("three")){
                res.append("two"+" ");
            }
            else{
                res.append(s+" ");
            }

        }
        System.out.println(str);
        System.out.println(res);


    }
}
