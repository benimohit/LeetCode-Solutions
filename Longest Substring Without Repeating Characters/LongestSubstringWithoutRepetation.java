import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepetation {

    public static int lengthOfLongestSubstring(String s) {
        int max =0, i=0, j  = 0;
        Set<Character> set = new HashSet<>();
        while(i < s.length()){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            else{
                set.add(s.charAt(i));
                i++;
                if(set.size() > max){
                    max= set.size();
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }
}
