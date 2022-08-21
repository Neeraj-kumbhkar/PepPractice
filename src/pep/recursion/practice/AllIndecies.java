package pep.recursion.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllIndecies {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here
        int[] indecies;
        if (idx == arr.length - 1) {
            indecies = new int[fsf];
            return indecies;
        }
        if (x == arr[idx]) {
            indecies = allIndices(arr, x, idx + 1, fsf + 1);
            indecies[fsf] = idx;
        } else {
            indecies = allIndices(arr, x, idx + 1, fsf);
        }
        return indecies;
    }
}