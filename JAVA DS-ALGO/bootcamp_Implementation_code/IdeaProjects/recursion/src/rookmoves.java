public class rookmoves {
    public static void main(String[] args) {
        int n=1;
        System.out.println(ways(0,0,n,n));


    }
    public static int ways(int cr,int cc,int er,int ec){
        if (cr>er||cc>ec){
            return 0;
        }
        if (cr==er&&cc==ec){
            return 1;
        }
        int dways=0,rways=0;
        for (int i = cr+1; i<=er; i++) {
            dways+=ways(i,cc,er,ec);
        }
        for (int i = cc+1; i<=ec; i++) {
            dways+=ways(cr,i,er,ec);
        }
        int noofways=dways+rways;
        return noofways;
    }

}
