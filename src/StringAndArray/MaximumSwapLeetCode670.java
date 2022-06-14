package StringAndArray;

import java.util.Scanner;
https:leetcode.com/problems/maximum-swap/
public class MaximumSwapLeetCode670 {
    public static int maximumSwap(int num){
        char[] str = (num+"").toCharArray();
        int n = str.length;
        int[] arr = new int[10];
        for(int i=0;i<n;i++) arr[str[i]-'0']=i;
        for(int i=0;i<n;i++){
           for(int j=9;j>str[i]-'0';j--){
               if(arr[j]>i){
                   char tmp = str[i];
                   str[i] = (j+"").charAt(0);
                   str[arr[j]] = tmp;
                   return Integer.parseInt(String.valueOf(str));
               }
           }
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(MaximumSwapLeetCode670.maximumSwap(new Scanner(System.in).nextInt()));
    }
}
