package Dynamic_programming.zero_knapsack.zero_one_Knapsack_based;/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws  IOException
    {

        Scanner s=new Scanner(System.in);
        int testcases=s.nextInt();
        for (int i=1;i<=testcases ;i++ ){
            int a1,a2,a3,t1,t2,t3;
            t1=s.nextInt();
            t2=s.nextInt();
            t3=s.nextInt();
            a1=s.nextInt();
            a2=s.nextInt();
            a3=s.nextInt();

            System.out.println(count(a1,a2,a3,t1,t2,t3));

        }



    }
    public static int count(int a1,int a2,int a3,int t1,int t2,int t3){
        int step=0;

        while(!(t1==a1&&t2==a2&&t3==a3)) {
            int d1=t1-a1;
            int d2=t2-a2;
            int d3=t3-a3;
            if ((a1!=0&&a2!=0&&a3!=0)&&(t1 % a1 == 0 && t2 % a2 == 0 && t3 % a3 == 0)){
                if (t1 / a1 == t2 / a2 && t3 / a3 == t1 / a1) {
                    step += 1;
                    break;
                }
            }
            if (d1==d2&&d1==d3){
                step+=1;
                break;
            }
            if ((d1==d2&&d1!=0)||((a1!=0&&a2!=0)&&(d1!=0&&d2!=0))&&(t1%a1==0&&t2%a2==0)&&(t1/a1==t2/a2)){
                step+=1;
                a1=t1;
                a2=t2;
                continue;
            }
            else if ((d2==d3&&d2!=0)||((a2!=0&&a3!=0)&&(d2!=0&&d3!=0))&&(t2%a2==0&&t3%a3==0)&&(t2/a2==t3/a3)){
                step+=1;
                a2=t2;
                a3=t3;
                continue;
            }
            else if ((d1==d3&&d1!=0)||((a1!=0&&a3!=0)&&(d1!=0&&d3!=0))&&(t1%a1==0&&t3%a3==0)&&(t1/a1==t3/a3)){
                step+=1;
                a3=t3;
                a1=t1;
                continue;
            }
            else if(a1!=t1){
                a1=t1;
                step+=1;
                continue;
            }
            else if (a2!=t2){
                a2=t2;
                step++;
                continue;
            }
            else if (a3!=t3)
            {
                a3=t3;
                step++;
                continue;
            }
            else{}







        }
        return step;
    }
}