/*
 Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
 */


 import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		   Scanner sc = new Scanner(System.in);

       int S =sc.nextInt();

       int E =sc.nextInt();

       int W =sc.nextInt();

       while(S<=E) {

           int  C1=((5*(S-32))/9);

         System.out.println(S+"\t"+C1);

        S=S+W;
	   }

         
		

		

		



		
	}

}
