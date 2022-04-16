package recursion.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class mazePathWIthjumps {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<String> ans = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> baseAns = new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        ArrayList<String> myPaths = new ArrayList<>();

        //horizontal move
        for (int i = 1; i + sc <= dc; i++) {
            ArrayList<String> paths = getMazePaths(sr, sc + i, dr, dc);
            for (String string : paths) {
                myPaths.add("h" + i + string);
            }
        }
        //vertical move
        for (int i = 1; i + sr <= dr; i++) {
            ArrayList<String> paths = getMazePaths(sr + i, sc, dr, dc);
            for (String string : paths) {
                myPaths.add("v" + i + string);
            }
        }
        //diagonal move
        for (int i = 1; i + sr <= dr && i + sc <= dc; i++) {
            ArrayList<String> paths = getMazePaths(sr + i, sc + i, dr, dc);
            for (String string : paths) {
                myPaths.add("d" + i + string);
            }
        }
      return  myPaths;
    }
}
