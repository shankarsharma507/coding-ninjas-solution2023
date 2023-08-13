// Given a string S (that can contain multiple words), you need to find the word which has minimum length.


public class Solution {
    
    public static String minLengthWord(String input) {
        String[] words = input.split(" ");
        String shortestWord = "";
        int minLength = Integer.MAX_VALUE;
        
        for (String word : words) {
            if (containsAlphabeticCharacters(word)) {
                int wordLength = word.length();
                if (wordLength < minLength) {
                    minLength = wordLength;
                    shortestWord = word;
                }
            }
        }
        
        return shortestWord;
    }
    
    private static boolean containsAlphabeticCharacters(String word) {
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                return true;
            }
        }
        return false;
    }
    
  
    
}
