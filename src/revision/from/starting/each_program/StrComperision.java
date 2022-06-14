package revision.from.starting.each_program;

public class StrComperision {
    public static String comp(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int count =1;
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            char p = s.charAt(i-1);
            if(p!=c){
                sb.append(count>=1?count:"");
                count=1;
                sb.append(c);
            } else {
                count++;
            }
        }
        sb.append(count!=1?count:"");
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(comp("aaabbbcdd"));
    }
}
