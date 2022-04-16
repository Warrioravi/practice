import com.sun.xml.internal.txw2.TXW;

public class minWINDOW {
    public static void main(String[] args) {
        System.out.println(mws("ADOBECODEBANC","ABC"));
    }
    public static String mws(String txt,String pattern){
        int[] hast_patt=new int[256];
        int[] hash_txt=new int[256];
        for (int i = 0; i < pattern.length()  ; i++) {
            hast_patt[pattern.charAt(i)]++;
        }
        int start=0,starting_index=-1, count=0;
        int min_len=Integer.MAX_VALUE;
        for (int j=0;j<txt.length();j++){
            hash_txt[txt.charAt(j)]++;
            if (hast_patt[txt.charAt(j)]!=0&&hash_txt[txt.charAt(j)]<=hast_patt[txt.charAt(j)])
            {
                count++;
            }
            if (count==pattern.length()){
                while (hash_txt[txt.charAt(start)]>hast_patt[txt.charAt(start)]||hast_patt[txt.charAt(start)]==0){
                    if (hash_txt[txt.charAt(start)]>hast_patt[txt.charAt(start)]){
                        hash_txt[txt.charAt(start)]--;
                    }
                    start++;
                }
                int len_window=j-start+1;
                if (min_len>len_window){
                    min_len=len_window;
                    starting_index=start;
                }
            }
        }
        if(starting_index==-1){

            System.out.println("No window found");
            return "";
        }
        else return txt.substring(starting_index,starting_index+min_len);


    }

}


