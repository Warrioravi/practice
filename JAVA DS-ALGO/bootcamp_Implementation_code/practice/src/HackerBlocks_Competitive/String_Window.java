package HackerBlocks_Competitive;

public class String_Window {
    public static void main(String[] args) {
        System.out.println(findminimum("qwertykeypad","keyd"));
    }

    public static String findminimum(String string,String pattern){
        int[] pat=new int[255];
        int[] str=new int[255];
        for (int i=0;i<pattern.length();i++) {
            pat[pattern.charAt(i)]++;
        }
        int count=0,min=Integer.MAX_VALUE,start=-1;






        return "";
    }
}



