// For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.


public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		 if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[128];

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    
	}

}