public class hackerrank {
    public static void main(String[] args) {
        String s="07:05:45PM";
        int n=Integer.parseInt(s.substring(0,2));
        if (s.charAt(8)=='A'){
            System.out.println(s.substring(0,8));
        }else{
            System.out.println(12+n+s.substring(2,8));
        }

    }
}
