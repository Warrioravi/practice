package october12;
import java.util.*;

public class romantoInteger {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=0;
        int curr=0;
        int n=s.length();
        while(curr<n)
        {
            if(curr==n-1){
                res+=map.get(s.charAt(curr));
                return res;
            }
            else{
                int next=curr+1;
                if(map.get(s.charAt(curr))>=map.get(s.charAt(next))){
                    res+=map.get(s.charAt(curr));
                    curr=curr+1;
                }
                else{
                    res+=map.get(s.charAt(next))-map.get(s.charAt(curr));
                    curr=curr+2;
                }
            }
        }
        return res;


    }
}
