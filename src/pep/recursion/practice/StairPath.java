package pep.recursion.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StairPath {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> pq = new ArrayList<>();
            pq.add("");
            return pq;
        } else if (n<0){
            ArrayList<String> pt = new ArrayList<>();
            return pt;
        }
        ArrayList<String> paths = new ArrayList<>();
        ArrayList<String> p1 = getStairPaths(n-1);
        for (String path:p1){
            paths.add("1"+path);
        }
        ArrayList<String> p2 = getStairPaths(n-2);
        for (String path:p2){
            paths.add("2"+path);
        }
        ArrayList<String> p3 = getStairPaths(n-3);
        for (String path:p3){
            paths.add("3"+path);
        }
        return paths;
    }
}