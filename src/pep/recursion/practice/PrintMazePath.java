package pep.recursion.practice;

import java.util.Scanner;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int dr= sc.nextInt();
        int dc= sc.nextInt();
        printMazePaths(1, 1, dr, dc,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        if (sc>dc || sr>dr){
            return;
        }
        printMazePaths(sr, sc+1, dr, dc, "h"+psf);
        printMazePaths(sr+1, sc, dr, dc, "v"+psf);
        }

    }

