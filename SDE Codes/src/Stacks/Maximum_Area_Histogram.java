package Stacks;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Maaain {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input=br.readLine().split(" ");
        int row=Integer.parseInt(input[0]);
        int col=Integer.parseInt(input[1]);
        int[][] arr=new int[row][col];

        for (int[] array:arr) {
            String s= br.readLine(); //Input the number seperated by space
            String[] s1 = s.split(" ");
            for(int i=0;i<col;i++)
            {
                array[i]=Integer.valueOf(s1[i]);
            }
        }
//        int[][] arr={{1,1,1},{1,1,1},{1,0,4}};
        System.out.println(maxArea(arr,row,col));


    }


    public static int maxArea(int[][] arr,int row,int col){
        int[] array=new int[col];
        for(int i=0;i<col;i++){
            array[i]=arr[0][i];
        }
        int max= Area(array);
        for (int i = 1; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j]==1){
                    array[j]+=1;
                }
                else array[j]=0;
            }
            max=Math.max(Area(array),max);
        }
        return max;
    }
    public static int Area(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        return getMax(heights, 0, heights.length);
    }
    static int getMax(int[] heights, int s, int e) {
        if (s + 1 >= e) return heights[s];
        int min = s;
        boolean sorted = true;
        for (int i = s; i < e; i++) {
            if (i > s && heights[i] < heights[i - 1]) sorted = false;
            if (heights[min] > heights[i]) min = i;
        }
        if (sorted) {
            int max = 0;
            for (int i = s; i < e; i++) {
                max = Math.max(max, heights[i] * (e - i));
            }
            return max;
        }
        int left = (min > s) ? getMax(heights, s, min) : 0;
        int right = (min < e - 1) ? getMax(heights, min + 1, e) : 0;
        return Math.max(Math.max(left, right), (e - s) * heights[min]);
    }
}