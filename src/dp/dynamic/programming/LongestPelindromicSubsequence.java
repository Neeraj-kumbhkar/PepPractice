package dp.dynamic.programming;

import java.util.Arrays;

public class LongestPelindromicSubsequence {
    public static void main(String[] args) {
        //String s = "abccbc";
        String s = "bbbab";
        //System.out.println(lPSs(s,0,s.length()-1));
        int[][] dp = new int[5][5];
        Arrays.fill(dp,-1);
        System.out.println(lPSsMomo(s,0,s.length()-1,dp));
    }
    private static int lPSs(String s, int start_index, int end_index) {
        if (start_index >= end_index) {
            if (start_index == end_index) return 1;
                return 0;
        }
            int ans = 0;
            if (s.charAt(start_index) == s.charAt(end_index)) {
                int cans = lPSs(s, start_index + 1, end_index-1) + 2;
                ans = cans;
            } else {
                int cansTwo = Math.max(lPSs(s, start_index + 1, end_index), lPSs(s, start_index, end_index - 1));
                ans = cansTwo;
            }
        return ans;
    }

    private static int lPSsMomo(String s, int si, int ei,int[][] dp) {
        if (si >= ei) {
            if (si == ei) return dp[si][ei]=1;
            return dp[si][ei]=0;
        }
        if(dp[si][ei]!=-1) return dp[si][ei];
        int ans = 0;
        if (s.charAt(si) == s.charAt(ei)) {
            int cans = lPSsMomo(s, si + 1, ei-1,dp) + 2;
            ans = cans;
        } else {
            int cansTwo = Math.max(lPSsMomo(s, si + 1, ei,dp), lPSsMomo(s, si, ei - 1,dp));
            ans = cansTwo;
        }
        return dp[si][ei] = ans;
    }
}
