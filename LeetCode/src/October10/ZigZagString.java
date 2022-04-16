package October10;

public class ZigZagString {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }
    public static String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder[] arr=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            arr[i]=new StringBuilder();
        }
        int currRow=1;
        int n=s.length();
        boolean isDown=true;
        int index=0;
        while(index<n){
            char cc=s.charAt(index++);
            arr[currRow-1].append(cc);
            if(currRow==1){
                isDown=true;
            }
            if(currRow==numRows){
                isDown=false;
            }
            if(isDown){
                currRow++;
            }
            else{
                currRow--;
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<numRows;i++){
            res.append(arr[i]);
        }
        return res.toString();

    }
}
