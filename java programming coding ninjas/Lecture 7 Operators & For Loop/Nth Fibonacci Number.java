/*The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n - 1) + F(n - 2), 
    Where, F(1) = 1, F(2) = 1


Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected. */


import java.util.Scanner;



public class Solution {


	
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	    public static int Fibonacci(int n){
			if(n <= 0){
				return -1;
			}
			else if(n == 1 || n== 2){
				return 1;

			}
			else{
				return Fibonacci(n - 1) + Fibonacci(n - 2);

			}

		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double N = sc.nextDouble();
			int result =  Fibonacci((int) N);
			System.out.println(result);


		
	}

}
