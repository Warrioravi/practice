package recursion;

public class traps {
    static int[] prime=new int[100002];
    public static void sieveOfEratosthenes()
    {
        int n=100001;
        for(int i=0;i<n;i++)
            prime[i] = 1;

        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == 1)
            {
                for(int i = p*2; i <= n; i += p)
                    prime[i] =0;
            }
        }
        int count=0;
        for(int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                count += 1;
            }
                prime[i]=count;
        }
    }


    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,1,1,};
        sieveOfEratosthenes();
        System.out.println(findways(arr,0,arr.length-1,1,2));

    }
    public static int findways(int[] arr,int current,int target,int r1,int r2){

        if (current>target){
            return Integer.MAX_VALUE-arr.length;
        }if (arr[current]==0||arr[target]==0){
            return Integer.MAX_VALUE-arr.length;
        }
        if (current==target){
            return 0;
        }
        int specialway=0;
        int oneway=findways(arr,current+1,target,r1,r2);
        int twoway=findways(arr,current+2,target,r1,r2);
        if (isSpecial(arr[current],r1,r2)){
            specialway=findways(arr,current+prime[current],target,r1,r2);
        }
        return 1+Math.min(Math.min(oneway,twoway),specialway);
    }
    public static boolean isSpecial(int n,int r1,int r2){
        if ((prime[n]/n)>=(r1/r2)){
            return true;
        }
        return false;
    }

}
