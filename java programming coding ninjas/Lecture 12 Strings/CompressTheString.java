// Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.


public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.
		StringBuilder a =new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            a.append(str.charAt(i));
            byte count=1;
            if (i<str.length()-1){
                while (str.charAt(i) == str.charAt(i + 1)) {
                    i++;
                    count++;
                    if (i>=str.length()-1) break;
                }
                if (count>1) a.append(count);
            }

        }


       return a.toString();
	}

}