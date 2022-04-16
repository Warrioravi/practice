package nagarro_practice;

public class closestsumpairtwoarrays {
    public static void main(String[] args) {
        int[] arr1={1, 4, 5, 7};
        int[] arr2={10, 20, 30, 40};
        printclosest(arr1,arr2,arr1.length-1,arr2.length-1,38);
    }
    public static void printclosest(int[] arr1,int[] arr2,int size1,int size2,int target){
        int left=0,right=0;
        int low=0,high=size2;
        int difference=Integer.MAX_VALUE;

        while(low<=size1&&high>=0){
            if (Math.abs(arr1[low]+arr2[high]-target)<difference){
               difference=Math.abs(arr1[low]+arr2[high]-target);
               left=low;
               right=high;

            }
            else if ((arr1[low]+arr2[high])<target){
            low++;
            }
            else high--;
        }
        System.out.println(arr1[left]+" "+arr2[right]);
    }
}
