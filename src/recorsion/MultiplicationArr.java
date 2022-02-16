package recorsion;

import java.util.Scanner;

public class MultiplicationArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(multiplcatioOfArr(arr,0));
    }

    private static int multiplcatioOfArr(int[] arr,int idx) {
        if(idx== arr.length) return 1;
        return arr[idx]*multiplcatioOfArr(arr,idx+1);
    }
}
