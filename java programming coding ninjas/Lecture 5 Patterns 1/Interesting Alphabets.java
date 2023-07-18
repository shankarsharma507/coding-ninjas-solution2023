/*Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
 */

 import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		//Your code goes here
               Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
        int i = 0;

        
		
		while(i < n){
			char ch = (char) ('A' + n - 1 - i);
			
			int j = 0;
			while(j <= i){
				System.out.print(ch);
				ch = (char) (ch + 1);
				j++;


			}

			
			System.out.println();
			i = i +1;

		}
	}
}