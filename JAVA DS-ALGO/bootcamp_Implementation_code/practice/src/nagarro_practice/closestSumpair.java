package nagarro_practice;

public class closestSumpair {
    public static void main(String[] args) {
        int[] arr={10, 22, 28, 29, 30, 40};
        int x=54;
        printclosest(arr,arr.length-1,x);
    }
    public static void printclosest(int[] arr,int right,int target){
    int left=0;
    int index1 = 0,index2 = 0;

    int diff=Integer.MAX_VALUE;
    while (left<right){
        if (Math.abs(arr[left]+arr[right]-target)<diff){
            diff=Math.abs(arr[left]+arr[right]-target);
            index1=left;
            index2=right;
        }
        else if (arr[left]+arr[right]<target){
            left++;
        }
        else right--;
    }
        System.out.println(arr[index1]+" "+arr[index2]);
    
    
    
    }
}
