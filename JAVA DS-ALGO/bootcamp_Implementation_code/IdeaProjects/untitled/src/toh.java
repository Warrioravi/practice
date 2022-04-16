public class toh {
    public static void main(String[] args) {
        towerofhanoi(3,"start","aux","end");

    }
    public static void towerofhanoi(int n,String Start,String Aux,String end){
        if (n==0){
            return;
        }
        towerofhanoi(n-1,Start,end,Aux);
        System.out.println("move" +n+"from"+Start+"to"+end);
        towerofhanoi(n-1,Aux,Start,end);
    }
}
