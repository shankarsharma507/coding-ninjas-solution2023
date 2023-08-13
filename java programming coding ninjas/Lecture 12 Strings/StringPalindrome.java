// Given a string, determine if it is a palindrome, considering only alphanumeric characters.



public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
	  // Step 1: Remove non-alphanumeric characters and convert to lowercase
        String cleanedInput = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Compare first and last characters iteratively
        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                // If the characters don't match, it's not a palindrome
                return false;
            }
            left++;
            right--;
        }

        // If the loop completes without returning false, it's a palindrome
        return true;
    }
}