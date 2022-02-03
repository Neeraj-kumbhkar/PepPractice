package pep.recursion.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class getSubSeq {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(gss(sc.next()));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> res1= new ArrayList<>();
            res1.add("");
            return res1;
        }
        char ch = str.charAt(0);
        ArrayList<String>list=gss(str.substring(1));
        ArrayList<String> res= new ArrayList<>();
        for (String a:list){
            res.add(""+a);
        }
        for (String a:list){
            res.add(ch+a);
        }
        return res;
    }
}
