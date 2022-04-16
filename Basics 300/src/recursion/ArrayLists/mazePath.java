package recursion.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class mazePath {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        ArrayList<String> ans= getMazePaths(0,0,n-1,m-1);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr&&sc==dc){
            ArrayList<String> baseAns= new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        if(sr>dr||sc>dc){
            return new ArrayList<String>();
        }
        ArrayList<String> paths1=getMazePaths(sr,sc+1,dr,dc);//horizontal move
        ArrayList<String> paths2=getMazePaths(sr+1,sc,dr,dc);//vertical move

        ArrayList<String> myPaths=new ArrayList<>();
        for(String string:paths1){
            myPaths.add("h"+string);
        }
        for(String string:paths2){
            myPaths.add("v"+string);
        }
        return myPaths;

    }

}
