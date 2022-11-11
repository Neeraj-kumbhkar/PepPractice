package pep.recursion.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int dr= sc.nextInt();
        int dc= sc.nextInt();
        System.out.println(getMazePaths(1, 1, dr, dc));
    }

    // sr - source row
     //sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }
        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();
       if (sr<dr ){
           hPaths = getMazePaths(sr+1, sc, dr, dc);
       }
        if (sc<dc){
            vPaths = getMazePaths(sr, sc+1, dr, dc);
        }
        ArrayList<String> paths = new ArrayList<>();
        for (String hP : hPaths){
            paths.add("h"+hP);
        }
        for (String vP : vPaths) {
            paths.add("v" + vP);
        }
        return paths;
    }
}
