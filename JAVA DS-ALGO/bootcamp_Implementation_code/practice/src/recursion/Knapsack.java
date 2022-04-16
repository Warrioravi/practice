package recursion;

public class Knapsack {
    public static void main(String[] args) {
        int[] weight={1,2,3,5};
        int[] values={40,20,30,100};
        System.out.println(Knapsack0_1(weight,values,7,weight.length-1));
    }
    public static  int Knapsack0_1(int[] weight,int[] value,int capacity,int current){
        if (current<0||capacity==0){
            return 0;
        }

        if (capacity>=weight[current]){
            return Math.max(value[current]+Knapsack0_1(weight,value,capacity-weight[current],current-1),Knapsack0_1(weight,value,capacity,current-1));
        }
        else {
            return Knapsack0_1(weight,value,capacity,current-1);
        }

    }



}
