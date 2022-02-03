package pep.recursion.practice;

import java.util.Scanner;

public class AllIndicies {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,3,4,5,7,3,8,3,4,5};
        for(int a:allIndices(arr, 3, 0, 0)) {
            System.out.println(a);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
       if (idx==arr.length){
           return new int[fsf];
       }
        int[] r;
       if(arr[idx]==x){
           r = allIndices(arr, x, idx+1, fsf+1);
           r[fsf]=idx;
       } else {
           r = allIndices(arr, x, idx+1, fsf);
       }
       return r;
    }
}

