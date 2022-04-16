package October10;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'d','w','w','d','d','d','d','d','d','w','w'}));
    }
    public static int compress(char[] chars) {
        int filler=0;
        int index=0;
        int n=chars.length;
        while(index<n){
            char cc=chars[index];
            chars[filler++]=cc;
            int count=0;
            while(index<n&&chars[index]==cc){
                count++;
                index++;
            }
            if(count>1){
                if(count>9){
                    char[] current=Integer.toString(count).toCharArray();
                    for(char c:current){
                        chars[filler++]=c;
                    }

                }
                else{
                    chars[filler++]=(char)(count+'0');
                }

            }
        }
        return filler;
    }
}
