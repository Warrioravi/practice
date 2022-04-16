package october12;
import java.util.*;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(101));
    }

    public static String intToRoman(int num) {
        int[] arr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] str = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder sb = new StringBuilder();
        for (int i = 12; i >= 0; i--) {
            if (num == 0) {
                return sb.toString();
            }
            while (num >= arr[i]) {
                sb.append(str[i]);
                num -= arr[i];
            }
        }
        return sb.toString();

    }
}


    //ghatiya solution niche!


    // public   String intToRoman(int n) {
//             HashMap<Integer,String> map=new HashMap<>();
//             map.put(1,"I");
//             map.put(5,"V");
//             map.put(10,"X");
//             map.put(50,"L");
//             map.put(100,"C");
//             map.put(500,"D");
//             map.put(1000,"M");
//             if(map.containsKey(n)){
//                 return map.get(n);
//             }
//             String num=n+"";
//             StringBuilder ans=new StringBuilder();
//             int size=num.length();
//             int tenpower=(int)Math.pow(10,size-1);
//             for(int i=0;i<size;i++){
//                 if(n==0){
//                     return ans.toString();
//                 }
//                 int quotient=num.charAt(i)-'0';
//                 if(quotient>=1&&quotient<=3){
//                     for(int j=1;j<=quotient;j++){
//                         ans.append(map.get(tenpower));
//                     }

//                 }
//                 else if(quotient==4){
//                     ans.append(map.get(tenpower));
//                     ans.append(map.get(5*tenpower));

//                 }
//                 else if(quotient==5){
//                     ans.append(map.get(5*tenpower));

//                 }
//                 else if(quotient>=6&&quotient<=8){
//                     ans.append(map.get(5*tenpower));
//                     for(int j=1;j<=(quotient-5);j++){
//                         ans.append(map.get(tenpower));
//                     }

//                 }
//                 else if(quotient==9) {
//                     ans.append(map.get(tenpower));
//                     ans.append(map.get(tenpower*10));
//                 }
//                 else{

//                 }


//                 tenpower/=10;

//             }
//             return ans.toString();

//         }



