import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); //Length of Array

        int[][] arr= new int[num][num];
        for (int[] array:arr) {
            String s= br.readLine(); //Input the number seperated by space
            String[] s1 = s.split(" ");
            for(int i=0;i<num;i++)
            {
                array[i]=Integer.parseInt(s1[i]);
            }
        }
        spiral_Anticlockwaise(arr);
    }
    static void spiral_Anticlockwaise(int[][] arr){
        int rows=arr.length;
        int cols=arr[1].length;
        int left=0;
        int right=cols-1;
        int top=0;
        int bottom=rows-1;
        int count=rows*cols;
        int direction=1;
        while (left<=right&&top<=bottom){
            if(count>0){
                if(direction==1){
                    for (int i =top; i <=bottom ; i++) {
                        System.out.print(arr[i][left]+" ");
                        count--;


                    }
                    left++;
                    direction=2;

                }
            }
            if(count>0){
                if(direction==2){
                    for (int i = left; i <=right ; i++) {
                        System.out.print(arr[bottom][i]+" ");
                        count--;

                    }
                    direction=3;
                    bottom--;

                }
            }
            if(count>0){
                if(direction==3){
                    for (int i = bottom; i >=top ; i--) {
                        System.out.print(arr[i][right]+" ");
                        count--;

                    }
                    direction=4;
                    right--;


                }

            }
            if(count>0){
                if(direction==4){
                    for (int i = right; i >=left ; i--) {
                        System.out.print(arr[top][i]+" ");
                        count--;


                    }
                    direction=1;
                    top++;

                }
            }






        }

    }








}