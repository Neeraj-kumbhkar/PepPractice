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
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        ArrayList<String> Paths = new ArrayList<>();
        ArrayList<String> sl = getKPC(str.substring(1));
        ArrayList<String> al1 = new ArrayList<>();
        String word = arr[str.charAt(0)-'0'];
        for (int i=0; i<word.length();i++){
            for(String s:sl){
                al1.add(word.charAt(i)+s);
            }
        }
        return al1;
    }

}
