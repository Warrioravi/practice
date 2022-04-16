import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

    public class intersection {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int input=s.nextInt();
            ArrayList<Integer> list1=new ArrayList<>();
            for (int i = 0; i <input; i++) {
                     list1.add(s.nextInt());
            }
            ArrayList<Integer> list2=new ArrayList<>();
            for (int i = 0; i <input; i++) {
               list2.add(s.nextInt());
            }
            ArrayList<Integer> intersection=new ArrayList<>();
            for (int i = 0; i < input; i++) {
                for (int j =0; j <input ; j++) {
                    if (list1.get(i)==list2.get(j)) {
                        intersection.add(list1.get(i));
                        i++;
                        list2.remove(j);
                    }

                }

            }
            Collections.sort(intersection);
            System.out.println(intersection);


        }
    }

