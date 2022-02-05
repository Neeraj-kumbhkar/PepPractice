package pep.recursion.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathWithJump {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int dr= sc.nextInt();
        int dc= sc.nextInt();
        System.out.println(getMazePathsWithJump(1, 1, dr, dc));
    }

    private static ArrayList getMazePathsWithJump(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> p = new ArrayList<>();
            p.add("");
            return p;
        } else if (sr > dr || sc > dc) {
            ArrayList< String> bres = new ArrayList< >();
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        for(int i= 1;i<=dc-sc;i++){
            ArrayList<String> hPaths  = getMazePathsWithJump(sr, sc+i, dr, dc);
            for (String path:hPaths){
                paths.add("h"+i+path);
            }
        }
        for(int i= 1;i<=dr-sr;i++){
            ArrayList<String> vPaths =  getMazePathsWithJump(sr+i, sc, dr, dc);
            for (String path:vPaths){
                paths.add("v"+i+path);
            }
        }
        for(int i = 1;i<=dr-sr && i<=dc-sc;i++){
            ArrayList<String> dPaths = getMazePathsWithJump(sr+i, sc+i, dr, dc);
            for (String path:dPaths){
                paths.add("d"+i+path);
            }
        }
        return paths;
    }
}
