/*Print the following pattern for the given N number of rows.
Pattern for N = 5
E
ED
EDC
EDCB
EDCBA
Input format :
Integer N (Total no. of rows)
 */


 
public class Solution {
    public static void alphabetPattern(int n) {
        // Write your code here
       
		int i = 1;
		while(i <= n){
			int j = 1;
			 char ch = (char) ('A' + n - 1);
			while(j <= i){

				System.out.print(ch);
			  ch = (char)(ch - 1);
				j = j + 1;

			}
			System.out.println();
			i = i + 1;
		}
	}

}		


