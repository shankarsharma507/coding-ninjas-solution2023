// For a given input string(str), write a function to print all the possible substrings.


public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
		int n = str.length();
  
    for (int len = 1; len <= n; len++) {  // Length of substring
        for (int i = 0; i <= n - len; i++) {  // Starting index of substring
            int j = i + len - 1;  // Ending index of substring
  
            for (int k = i; k <= j; k++) {  // Print substring from index i to j
                System.out.print(str.charAt(k));
            }
            System.out.println();  // Print newline after each substring
	}

}
	}
}