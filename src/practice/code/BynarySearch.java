package practice.code;

import java.util.Scanner;

public class BynarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int[] arr = {1,2,3,4,8,10,12,24,27};
        int index = bynarySearchFunc(arr,key);
        System.out.println(index);
    }

    private static int bynarySearchFunc(int[] arr, int key) {
        int l = 0;
        int r = arr.length-1;
        while (l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==key) {
                return mid;
            } else if(arr[mid]>key){
                r=mid-1;
            } else {
                l = mid+1;
            }
        }
        return -1;
    }
}
