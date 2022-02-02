package practice.code;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList< String> paths = getMazePaths(1, 1, n, m);

        System.out.println(paths);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> dontMove = new ArrayList<>();
            dontMove.add("");
            return dontMove;
        }
        ArrayList<String> Paths = new ArrayList<>();
        for (int hms = 1; hms <= dc - sc; hms++) {
            ArrayList<String> hPaths = getMazePaths(sr, sc + hms, dr, dc);
            for (String path : hPaths) {
                Paths.add("h" + hms + path);
            }
        }
        for (int vms = 1; vms <= dr - sr; vms++) {
            ArrayList<String> vPaths = getMazePaths(sr + vms, sc, dr, dc);
            for (String path : vPaths) {
                Paths.add("v" + vms + path);
            }
        }
        for (int dms = 1; dms <= dr - sr && dms <= dc - sc; dms++) {
            ArrayList<String> dPaths = getMazePaths(sr + dms, sc + dms, dr, dc);
            for (String path : dPaths) {
                Paths.add("d" + dms + path);
            }
        }
        return Paths;

    }
}
