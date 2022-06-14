package pep.recursion.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class KPC {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(getKPC(sc.next()));
    }
    static String[] arr1 = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> res1 = new ArrayList<>();
            res1.add("");
            return res1;
        }
        78   8 == add 7 to infornt of 8
        char a = str.charAt(0);
        String code = arr1[a-'0'];
        ArrayList<String> rec = getKPC(str.substring(1));
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<code.length();i++){
            char chCode = code.charAt(i);
            for (String c:rec){
                res.add(chCode+c);
            }
        }
        return res;
    }
}
