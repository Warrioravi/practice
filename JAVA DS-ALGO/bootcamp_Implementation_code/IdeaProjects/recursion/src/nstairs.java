public class nstairs {
    public static void main(String[] args) {
        System.out.println(countways(3,2));

    }
   public static int countways(int start,int steps){
        if(start==0){
            return 1;
        }

        int ways=0;
       for (int i = 1; i <= steps; i++) {
           ways+=countways(start-1,steps);

       }
       return ways;
   }



}
