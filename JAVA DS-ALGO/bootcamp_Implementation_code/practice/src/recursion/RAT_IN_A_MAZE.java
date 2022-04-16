package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RAT_IN_A_MAZE {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        s.nextLine();
        char[][] arr=new char[n][m];
        int[][] ans=new int[n][m];
        for (int [] array:ans) {
            Arrays.fill(array,0);
        }
        for (int i = 0; i < n; i++) {
            String ST=s.nextLine();
            char[] a=ST.toCharArray();
            arr[i]=a;
        }

        if (!mazepath(arr,0,0,n-1,m-1,ans)){
            System.out.println(-1);
        }
    }
    public static boolean mazepath(char[][] grid,int cr,int cc,int er,int ec,int[][] ans){
        if (cr==er&&cc==ec){
            ans[cr][cc]=1;
            display(ans);
            return true;
        }
        ans[cr][cc]=1;
        if (isvalid(grid,cr,cc+1)) {
            if (mazepath(grid, cr, cc + 1, er, ec, ans)) {
                return true;
            }
        }
        if (isvalid(grid,cr+1,cc)) {
            if (mazepath(grid, cr+1, cc, er, ec, ans)) {
                return true;
            }
        }
        ans[cr][cc]=0;
        return  false;
    }
    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static boolean isvalid(char[][] arr,int cr,int cc){
        if (cr>=arr.length||cc>=arr[0].length){
            return  false;
        }
        if (arr[cr][cc]=='X'){
            return false;
        }
        return true;
    }
}
