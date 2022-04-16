package arrays_2D;

public class SPIRAL {
    public static void main(String[] args) {
        int[][] arr=arr= new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        //wave_rowwise(arr);
       // wave_columnwise(arr);
         // spiral_clockwise(arr);
       // spiral_Anticlockwaise(arr);
        //rotate_clockwise(arr);
      //  rotate_anti_clockwise(arr);
        //rotate_subarray(arr);





    }
    //*******************************************************************************************************



    public static void wave_columnwise(int[][] arr){
        int rows=arr.length;
        int cols=arr[1].length;
        System.out.println("rows: "+rows+"  "+"columns: "+cols);
        for (int i = 0; i < cols; i++) {
            if (i%2==0){
                for (int j = 0; j <rows ; j++) {
                    System.out.println(arr[j][i]+" ");
                }
            }
            else {
                for (int j = rows-1; j >=0 ; j--) {
                    System.out.println(arr[j][i] + " ");
                }
            }
        }
    }
    //******************************************************************************************************************




    public static void wave_rowwise(int[][] arr){
        int rows=arr.length;
        int cols=arr[1].length;
        System.out.println("rows: "+rows+"  "+"columns: "+cols);
        for (int i = 0; i < rows; i++) {
            if (i%2==0){
                for (int j = 0; j <cols ; j++) {
                    System.out.println(arr[i][j]+" ");
                }
            }
            else {
                for (int j = cols-1; j >=0 ; j--) {
                    System.out.println(arr[i][j] + " ");
                }
            }
        }

    }
    //*********************************************************************************************************



    //*********************************************************************************************************
    public static void spiral_clockwise(int[][] arr){
        int rows=arr.length;
        int cols=arr[1].length;
        int left=0;
        int right=cols-1;
        int top=0;
        int bottom=rows-1;
        System.out.println("rows: "+rows+"  "+"columns: "+cols);
        int count=rows*cols;
        System.out.println(count);
        int direction=1;
        while(left<=right&&top<=bottom){
            //***********************left to right
            if(count>0){
                if (direction==1){
                    for (int i = left; i <=right ; i++) {
                        System.out.println(arr[top][i]);
                        count--;

                    }
                  top++;
                    direction=2;
                }
            }
            //************************right to down
            if(count>0){
                if (direction==2){
                    for (int i = top; i <=bottom ; i++) {
                        System.out.println(arr[i][right]);

                    }
                    right--;
                    direction=3;
                    count--;

                }
            }
            //*************************right to left
            if(count>0){
                if (direction==3){
                    for (int i = right; i >=left ; i--) {
                        System.out.println(arr[bottom][i]);
                        count--;

                    }
                    bottom--;
                    direction=4;

                }

            }
            if(count>0){
                if (direction==4){
                    for (int i =bottom; i >=top ; i--) {
                        System.out.println(arr[i][left]);
                        count--;

                    }
                    left++;
                    direction=1;
                }
            }

        }

    }
    //************************************************************


    //************************************************************
    public static void spiral_Anticlockwaise(int[][] arr){
        int rows=arr.length;
        int cols=arr[1].length;
        int left=0;
        int right=cols-1;
        int top=0;
        int bottom=rows-1;
        System.out.println("rows: "+rows+"  "+"columns: "+cols);
        int count=rows*cols;
        System.out.println(count);
        int direction=1;
        while (left<=right&&top<=bottom){
            if(count>0){
                if(direction==1){
                    for (int i =top; i <=bottom ; i++) {
                        System.out.println(arr[i][left]);
                        count--;


                    }
                    left++;
                    direction=2;

                }
            }
            if(count>0){
                if(direction==2){
                    for (int i = left; i <=right ; i++) {
                        System.out.println(arr[bottom][i]);
                        count--;

                    }
                    direction=3;
                    bottom--;

                }
            }
            if(count>0){
                if(direction==3){
                    for (int i = bottom; i >=top ; i--) {
                        System.out.println(arr[i][right]);
                        count++;

                    }
                    direction=4;
                    right--;


                }

            }
            if(count>0){
                if(direction==4){
                    for (int i = right; i >=left ; i--) {
                        System.out.println(arr[top][i]);
                        count++;


                    }
                    direction=1;
                    top++;

                }
            }






        }

    }
}
