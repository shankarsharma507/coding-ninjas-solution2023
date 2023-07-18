/*Given a binary number as an integer N, convert it into decimal and print. */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		String n = sc.next();
		int decimalValue = Integer.parseInt(n, 2);
		System.out.print(decimalValue);
		

	}
}
