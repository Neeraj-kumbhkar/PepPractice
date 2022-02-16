package recorsion;

import java.util.ArrayList;
import java.util.Scanner;

public class StairPaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n <= 0) {
            ArrayList<String> path0 = new ArrayList<>();
            path0.add("");
            return path0;
        }
        ArrayList<String> paths = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            ArrayList<String> path = getStairPaths(n - i);
            for (String p : path) {
                paths.add(i + p);
            }
        }
        return paths;
    }
}
