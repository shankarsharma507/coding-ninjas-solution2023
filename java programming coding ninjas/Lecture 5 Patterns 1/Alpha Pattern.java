/*Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
 */


 import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		java.util.Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		
        int i = 0;

        while (i < n) {
             char ch = (char) ('A' + i);
            int j = 0;

            while (j <= i) {
                System.out.print(ch);
              
                j++;
            }
			  
            System.out.println();
            i++;

		
	}
	}

}