import java.util.*;

public class colection {
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        s.nextLine();
        String str=s.nextLine();
        System.out.println(find(rows,str));
    }
    public static  String find(int rows,String str){
        if( rows == 1 ){
            return str;
        }
        String[] ans=new String[rows];
        Arrays.fill(ans,"");
        int present_row=1;
        boolean down=true;
        for(int i=0;i<str.length();i++){
            char cc=str.charAt(i);
            ans[present_row-1]+=cc;
            if(present_row==rows){
                down=false;
            }
            if(present_row==1){
                down=true;
            }
            if(down){
                present_row++;
            }
            else{
                present_row--;
            }

        }
        String answer="";
        for(String i:ans){
            answer+=i;
        }

        return answer;

    }
}
