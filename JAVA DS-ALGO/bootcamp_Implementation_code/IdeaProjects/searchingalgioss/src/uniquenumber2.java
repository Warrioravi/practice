import java.util.Scanner;

class uniquenumbers2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int[] arr=new int[input];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
       unique2(arr);



    }
    public static void unique2(int arr[]){

        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result=result^arr[i];
        }
        int i=0;
        int temp=result;
        while(temp>0)
        {
            int sb=temp&1;
            if(sb==1){
                break;
            }
            i++;
            temp=temp>>1;
        }

        int mask=(1<<i);
        int res2=0;
        for(int j=0;j<arr.length;j++)
        {
            if((mask&arr[j])!=0)
            {
                res2=res2^arr[j];
            }
        }
        int nextnum=result^res2;
        if(nextnum>res2){


            System.out.println(res2+" "+nextnum);

        }
        else{
            System.out.println(nextnum+" "+res2);
        }
    }
}
