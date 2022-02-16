package practice.code;

import java.util.ArrayList;
import java.util.Scanner;

public class KPS {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        ArrayList<String> strs = getKPC(s);
        System.out.println(strs);
    }
    static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        ArrayList<String> faith = getKPC(str.substring(1));
        ArrayList<String> ans = new ArrayList<>();
        String word = arr[str.charAt(0)-'0'];

        for(int i=0; i<word.length(); i++){
            for(String f:faith){
                ans.add(word.charAt(i)+f);
            }
        }
        return ans;
    }

}