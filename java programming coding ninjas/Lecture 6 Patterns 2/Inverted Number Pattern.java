/*Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
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
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int i = n;

        while (i >= 1) {
            int j = 1;

            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
