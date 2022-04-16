import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class stringlec10 {
    public static void main(String[] args) {
        String s2="world";
        String str ="hello";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str+" "+s2+"!");
        System.out.println(str.charAt(0));
        System.out.println(str.substring(0,str.length()));
        System.out.println(str.subSequence(0,3));
        System.out.println(str.substring(3));
        System.out.println(str.startsWith("he"));
        System.out.println(str.startsWith("Hey"));
        StringBuilder sb=new StringBuilder("HELLO");
        sb.deleteCharAt(2);
        System.out.println(sb.toString());
        System.out.println(s2.contains("w "));
    }
}
