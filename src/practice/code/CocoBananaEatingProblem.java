package practice.code;

import java.util.Scanner;

public class CocoBananaEatingProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = scn.nextInt();
        }
        int h = scn.nextInt();

        int minSpeed = minEatingSpeed(piles,h);
        System.out.println(minSpeed);
    }
    public static int minEatingSpeed(int[] piles,int h){
        int lo = 1;
        int hi = (int) 1e9;
        int aSpeed = (int) 1e9;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (checker(piles,mid,h)==true){
               aSpeed = mid;
               hi = mid - 1;
            } else {
                lo = mid+1;
            }
        }
        return aSpeed;
    }

    private static boolean checker(int[] piles, int speed, int h) {
        int time =0;
        for (int nob:piles) {
            time += Math.ceil(nob/(1.0*speed));
        }
        return time<=h;
    }

}
