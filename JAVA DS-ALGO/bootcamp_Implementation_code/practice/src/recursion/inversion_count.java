package recursion;

public class inversion_count {
    public static void main(String[] args) {
        int[] arr={1,5,2,6,3,0};
        System.out.println(countInversions_DNC(arr,0,arr.length-1));
        //countInversion(arr,0,arr.length-1);//this recursive solution did not worked
    }
    public static int countInversions_DNC(int[] arr,int start,int end){
      if (start>=end){
          return 0;
      }
      int mid=(start+end)/2;
      int leftInversions=countInversions_DNC(arr,start,mid);
    int rightInversions=countInversions_DNC(arr,mid+1,end);
    int crossInversions=merge(arr,start,end);
    int totalcount=leftInversions+rightInversions+crossInversions;
    return totalcount;
    }
    public static int merge(int[] arr,int start,int end){
        int mid=(start+end)/2;
        int i=start;
        int j=mid+1;
        int k=start;//for filling of temp array
        int[] temp=new int[10000];
        int count=0;
        while(i<=mid&&j<=end){
          if (arr[i]<=arr[j]){
              temp[k++]=arr[i++];
          }else{
              count+=mid-i+1;
              temp[k++]=arr[j++];
          }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=end){
            temp[k++]=arr[j++];
        }
        for (int l = start; l <=end ; l++) {
            arr[l]=temp[l];

        }
    return count;
    }





















/*
      public static int countInversion(int[] arr,int start,int end){
        if(start==end) {
        return  countInversion(arr,start+1,arr.length-1);
        }
        if(start==arr.length-1){
            return 0;
        }
        int count=0;

        if (arr[start]>arr[end]){
            count= 1+countInversion(arr,start,end-1);
        }
        else {
            count=countInversion(arr,start,end-1);
        }


        return count;
    }
    */

}
