// Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.

public class Solution {
	public static String reverseWordWise(String input) {
	 String[] arrOdStr=input.split(" ");
        String reverseWord="";
        for (int i = arrOdStr.length-1;i >=0 ; i--) {
            reverseWord+=arrOdStr[i]+" ";
        }
        return reverseWord;
	}
}
