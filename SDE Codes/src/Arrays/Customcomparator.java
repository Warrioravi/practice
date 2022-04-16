package Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class Customcomparator {

    static class obj{
        int age;
        int money;
        obj(int age,int money){
            this.age=age;
            this.money=money;
        }
    }

    public static void main(String[] args) {
        obj [] arr=new obj[3];
        arr[0]=new obj(1,4);
        arr[1]=new obj(10,1);
        arr[2]=new obj(18,10000);



        Arrays.sort(arr,Comparator.comparing(obj -> obj.money));
        Collections.reverse(Arrays.asList(arr));



    }
    
}


