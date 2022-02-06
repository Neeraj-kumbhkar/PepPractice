package pep.recursion.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintMazePathWithJumps {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePathsWithJ(0, 0, n - 1, m - 1, "");
    }

    public static void printMazePathsWithJ(int sr, int sc, int dr, int dc, String psf) {
        if (sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        for (int i=1;i<=dc-sc;i++){
            printMazePathsWithJ(sr, sc+i, dr, dc, psf+"h"+i);
        }
        for (int i=1;i<=dr-sr;i++){
            printMazePathsWithJ(sr+i, sc, dr, dc, psf+"v"+i);
        }
        for (int i=1;i<=dr-sr && i<=dc-sc ;i++){
            printMazePathsWithJ(sr+i, sc+i, dr, dc, psf+"d"+i);
        }
    }

    }
