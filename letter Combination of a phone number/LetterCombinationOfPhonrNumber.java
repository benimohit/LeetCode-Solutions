import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhonrNumber {

    public static void backtrack(String combination, String digits, List<String> output){
        String[] al = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length() == 0){
            output.add(combination);
        }
        else{
            int digit = Character.getNumericValue(digits.charAt(0));
            String letters = al[digit];
            for(int i = 0; i < letters.length(); i++){
                String letter = letters.substring(i,i+1);
                backtrack(combination+letter, digits.substring(1), output);
            }
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        if(digits.length() == 0) return output;
        backtrack("", digits, output);
        return output;

    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
