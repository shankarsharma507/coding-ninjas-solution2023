/*Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4. */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		  Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        System.out.println((int)Math.pow(n,0.5));

	}
}
