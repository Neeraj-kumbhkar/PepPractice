package LeetCode;

import practice.code.RcorsionPrintN;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LeetCodeDecode1 {
    public static void display(int[] dp) {
        for (int i : dp) System.out.print(i + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
         System.out.println(numDecoding(s));
         System.out.println(numDecodingMemo(s,new HashMap<String,Integer>()));
        System.out.println(numDecodingWithIdx(s,0));
        int[] arr = new int[s.length() + 1];
        Arrays.fill(arr, -1);
        System.out.println(numDecodingMemoWithIdx(s, 0, arr));
        System.out.println(numDecodingTabuWithIdx(s, 0, arr));

    }

    public static int numDecoding(String s) {
        if (s.length() == 0) return 1;
        int n = s.charAt(0) - '0';
        if (n == 0) return 0;
        int ans = 0;
        ans += numDecoding(s.substring(1));
        if (s.length() > 1) {
            n = (n * 10) + (s.charAt(1) - '0');
            if (n <= 26) {
                ans += numDecoding(s.substring(2));
            }
        }
        return ans;
    }
    memoization with hashmap

    public static int numDecodingMemo(String s, HashMap<String, Integer> dp) {
        if (s.length() == 0) {
            dp.put(s, 1);
            return 1;
        }
        if (dp.containsKey(s)) return dp.get(s);
        int n = s.charAt(0) - '0';
        if (n == 0) {
            dp.put(s, 0);
            return 0;
        }
        int ans = 0;
        ans += numDecodingMemo(s.substring(1), dp);
        if (s.length() > 1) {
            n = (n * 10) + (s.charAt(1) - '0');
            if (n <= 26) {
                ans += numDecodingMemo(s.substring(2), dp);
            }
        }
        dp.put(s, ans);
        return ans;
    }

    public static int numDecodingWithIdx(String s, int idx) {
        if (s.length() == idx) return 1;
        int n = s.charAt(idx) - '0';
        if (n == 0) return 0;
        int ans = 0;
        ans += numDecodingWithIdx(s, idx + 1);
        if (idx < s.length() - 1) {
            n = n * 10 + (s.charAt(idx + 1) - '0');
            if (n <= 26) {
                ans += numDecodingWithIdx(s, idx + 2);
            }
        }
        return ans;
    }

    public static int numDecodingMemoWithIdx(String s, int idx, int[] dp) {
        if (s.length() == idx) return dp[idx] = 1;
        int n = s.charAt(idx) - '0';
        if (n == 0) return dp[idx] = 0;
        if (dp[idx] != -1) return dp[idx];
        int ans = 0;
        ans += numDecodingMemoWithIdx(s, idx + 1, dp);
        if (idx < s.length() - 1) {
            n = n * 10 + (s.charAt(idx + 1) - '0');
            if (n <= 26) {
                ans += numDecodingMemoWithIdx(s, idx + 2, dp);
            }
        }
        dp[idx] = ans;
        return dp[idx];
    }

    public static int numDecodingTabuWithIdx(String s, int IDX, int[] dp) {
        for (int idx = s.length(); idx >= IDX; idx--) {
            if (s.length() == idx){
                dp[idx] = 1;
            continue;
        }
        int n = s.charAt(idx) - '0';
        if (n == 0) {
            dp[idx] = 0;
            continue;
        }
         if(dp[idx] != -1) return dp[idx];
        int ans = 0;
        ans += dp[idx + 1];numDecodingMemoWithIdx(s,idx+1,dp);
        if (idx < s.length() - 1) {
            n = n * 10 + (s.charAt(idx + 1) - '0');
            if (n <= 26) {
                ans += dp[idx + 2];numDecodingMemoWithIdx(s,idx+2,dp);
            }
        }
        dp[idx] = ans;
    }
    return dp[IDX];
}
}
