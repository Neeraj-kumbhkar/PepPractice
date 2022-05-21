package dp.dynamic.programming;

import java.util.HashMap;

public class NumEncoding {

    public static int numDecodings(String s){
        if(s.length()==0) return 1;
        int n = s.charAt(0)-'0';
        int ans=0;
        ans+=numDecodings(s.substring(1));
        if(s.length()>1){
            n=(n*10)+(s.charAt(1)-'0');
            if(n<=26){
                ans+=numDecodings(s.substring(2));
            }
        }
        return ans;
    }

    public static int numDecodingsMemo(String s, HashMap<String, Integer> dp){
        if(s.length()==0) {
            dp.put(s,1);
            return 1;
        }
        if(dp.containsKey(s)) return dp.get(s);
        int n = s.charAt(0)-'0';
        if(n==0){
            dp.put(s,0);
            return 0;
        }
        int ans = 0;
        ans+=numDecodingsMemo(s.substring(1), dp);
        if(s.length()>1){
            n=(n*10)+(s.charAt(1)-'0');
            if(n<=26) {
                ans += numDecodingsMemo(s.substring(2), dp);
            }
        }
        dp.put(s,ans);
        return ans;
        }


    public static void main(String[] args) {
        //System.out.println(numDecodings("12345"));
        System.out.println(numDecodingsMemo("12345", new HashMap<String,Integer>()));

    }
}
