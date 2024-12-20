
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>(); 
        }
        List<String> result = new ArrayList<>();
        result.add(""); 

        for (int i = 0; i < digits.length(); i++) {
            char digit = digits.charAt(i); 
            List<String> temp = new ArrayList<>();

            // Get the letters corresponding to the current digit
            String letters = getLetters(digit);

            
            for (String combination : result) { // new and better form of for loop
                for (int j = 0; j < letters.length(); j++) {
                    temp.add(combination + letters.charAt(j));
                }
            }

            result = temp;
        }

        return result;
    }

    private static String getLetters(char digit) {
        switch (digit) {
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "pqrs";
            case '8': return "tuv";
            case '9': return "wxyz";
            default: return "";
        }
    }
}
  