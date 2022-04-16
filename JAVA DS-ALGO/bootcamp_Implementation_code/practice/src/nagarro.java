public class nagarro {
    public static void main(String[] args) {
        String s="abc";
        int i=2;
        int j=2;
        int length=s.length();
        int count=0;
        String aux=s;
        while(true){
            aux=aux.substring(length-i)+aux.substring(0,length-i);
            count++;
            if(aux.equals(s)){
                break;
            }
            System.gc();
            aux=aux.substring(length-j)+aux.substring(0,length-j);
            count++;
            if(aux.equals(s)){
                break;
            }
            System.gc();


        }
        System.out.println(count);

    }
}
