public class mergearrays {
    public static void main(String[] args) {
        int[] arr1={0,2,4};
        int[] arr2={1,3,5,7,0,0,0};
        int k=arr2.length-1;
        int i=arr1.length;
        int j=arr2.length-arr1.length-1;
        while(i>=0&&j>=0){
            if(arr1[i]>=arr2[j]){
                arr2[k]=arr1[i];
                i--;
            }
            else{
                arr2[k]=arr2[j];
                j--;
            }
            k--;
        }
        for (int l = 0; l < arr2.length; l++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
