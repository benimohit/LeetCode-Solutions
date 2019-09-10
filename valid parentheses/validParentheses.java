import java.util.*;

public class validParentheses {
    public static boolean isValid(String s) {
        Stack<Character > s_p = new Stack<>();
        HashMap<Character,Character> h =new HashMap<>();
        h.put(')','('); h.put(']','['); h.put('}','{');
        for(int i = 0; i< s.length(); i++){
            char key = s.charAt(i);
            if(h.containsKey(key) && !s_p.isEmpty() && h.get(key) == s_p.peek()){
                s_p.pop();
            }
            else s_p.push(key);
        }
        if(s_p.isEmpty()) return true;
        return false;

    }
    public static void main(String[] args) {
        System.out.println(isValid("{()}"));
    }
}
