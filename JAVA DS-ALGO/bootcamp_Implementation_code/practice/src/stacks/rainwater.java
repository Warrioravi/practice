package stacks;

public class rainwater {


        public static void main(String[] args) {
            int arr[]={0 ,2 ,1 ,3 ,0, 1, 2, 1, 2, 1};
            int[] maxL=new int[arr.length];
            int[] maxR=new int[arr.length];
            maxL[0]=arr[0];
            for (int i = 1; i <arr.length; i++) {
                int max=Math.max(arr[i],maxL[i-1]);
                maxL[i]=max;
            }
            maxR[arr.length-1]=arr[arr.length-1];
            for (int i=arr.length-1-1;i>=0;i--){
                int max=Math.max(arr[i],maxR[i+1]);
                maxR[i]=max;
            }
            int water=0;
            for (int i = 0; i < arr.length; i++) {
                int curr=Math.min(maxL[i],maxR[i])-arr[i];
                water+=curr;
            }
            System.out.println(water);
        }
    }



