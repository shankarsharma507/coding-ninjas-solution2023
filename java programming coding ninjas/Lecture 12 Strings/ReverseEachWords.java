// Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed. A word is a combination of characters without any spaces.

public class Solution {

    public static String reverseEachWord(String str) {
        String[] arrStr = str.split(" ");
        StringBuilder myNewStr = new StringBuilder();

        for (int i = 0; i < arrStr.length; i++) {
            String s = arrStr[i];
            for (int j = s.length() - 1; j >= 0; j--) {
                myNewStr.append(s.charAt(j));
            }

            // Append a space after each word, except for the last word
            if (i < arrStr.length - 1) {
                myNewStr.append(" ");
            }
        }

        return myNewStr.toString();
    }
}
