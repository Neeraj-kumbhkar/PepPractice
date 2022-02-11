package dp.dynamic.programming;

public class MazePathMemo {
    public static void main(String[] args) {

        //System.out.println(mazePathRec(0, 0, 2, 2));
        //System.out.println(mazePathRecMemo(0, 0, 3, 3,new int[4][4]));
        System.out.println(mazePathtABULATION(0, 0, 3, 3,new int[4][4]));

    }
    public static void display2D(int[][] dp){
        for (int[] i:dp){
            for (int j:i) System.out.print(j+"\t");
            System.out.println();
        }
    }
    private static int mazePathRec(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) return 1;
        int[][] dirn = {{0, 1}, {1, 0}, {1, 1}};
        int ans = 0;
        for (int[] dir : dirn) {
            int v = sr + dir[0];
            int h = sc + dir[1];
            if (h <= dr && v <= dc) {
                ans += mazePathRec(v, h, dr, dc);
            }

        }
        return ans;
    }

    private static int mazePathRecMemo(int sr, int sc, int dr, int dc,int[][] dp) {
        if (sr == dr && sc == dc) return dp[sr][sc]=1;
        if(dp[sr][sc]!=0) return dp[sr][sc];
        int[][] dirn = {{0, 1}, {1, 0}, {1, 1}};
        int ans = 0;
        for (int[] dir : dirn) {
            int v = sr + dir[0];
            int h = sc + dir[1];
            if (h <= dr && v <= dc) {
                ans += mazePathRecMemo(v, h, dr, dc,dp);
            }
        }
        return dp[sr][sc]=ans;
    }

    private static int mazePathtABULATION(int SR, int SC, int dr, int dc,int[][] dp) {
        for(int sr=dr;sr>=SR;sr--){
            for (int sc=dc;sc>=SC;sc--){
                if (sr == dr && sc == dc) {
                    dp[sr][sc] = 1;
                    continue;
                }
                //if (sr == dr && sc == dc) return dp[sr][sc]=1;
                //if(dp[sr][sc]!=0) return dp[sr][sc];
                int[][] dirn = {{0, 1}, {1, 0}, {1, 1}};
                int ans = 0;
                for (int[] dir : dirn) {
                    int v = sr + dir[0];
                    int h = sc + dir[1];
                    if (h <= dr && v <= dc) {
                        ans += dp[v][h];
                    }
                }
                dp[sr][sc]=ans;
            }
        }
        return dp[SR][SC];
    }
}
