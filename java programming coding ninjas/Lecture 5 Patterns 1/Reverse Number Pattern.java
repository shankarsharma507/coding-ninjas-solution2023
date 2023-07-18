/*Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines */

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		int i = 1, j, n;
        Scanner input = new Scanner(System.in);
       
        n = input.nextInt();
        
        while (i <= n) {
           
            j = i;
            while (j > 0) {
                System.out.print(j);
                j--;
            }
			System.out.println();
            i++;
        }
    }

		
	}


