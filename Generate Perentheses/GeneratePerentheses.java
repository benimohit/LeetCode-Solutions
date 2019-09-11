import java.util.*;

public class GeneratePerentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> out = new ArrayList<>();
        backtrack(out,"",0,0,n);
        return out;
    }

    public static void backtrack(List<String> out, String cur, int open, int close, int max){
        if(cur.length() == max*2){
            out.add(cur);
            return;
        }
        if(open < max){
            backtrack(out, cur+"(", open+1, close, max);
        }
        if(close < open){
            backtrack(out, cur+")", open, close+1, max);
        }
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
