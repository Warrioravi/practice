package Arrays;

import java.util.Comparator;

public class comp implements Comparator<Integer> {

    @Override
    public int compare(Integer object1, Integer object2) {
        String str1=Integer.toString(object1);
        String str2=Integer.toString(object2);
        String first=str1+str2;
        String second=str2+str1;
        if (Integer.parseInt(first)<Integer.parseInt(second)){
            return 1;
        }
        else if (Integer.parseInt(first)==Integer.parseInt(second)){
            return 0;
        }
        else return -1;
    }
}
