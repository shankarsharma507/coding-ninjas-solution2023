/*Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).
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

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
        

        while(i <= n){
            int j = 1;
            
            while(j <= i){
                System.out.print('*');
                j = j + 1;
               // p = p + 1;
                

            }
            System.out.println();
            i = i + 1;
		}

		
	}

}
