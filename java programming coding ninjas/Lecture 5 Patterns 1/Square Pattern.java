/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444
Input format :
Integer N (Total no. of rows)
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
		int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= n){
                System.out.print(n);
                j = j + 1;
                

            }
            System.out.println();
            i = i + 1;

        }
                

		
	}

}
