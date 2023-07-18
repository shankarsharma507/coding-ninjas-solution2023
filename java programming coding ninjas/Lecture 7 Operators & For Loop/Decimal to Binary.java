/*Given a decimal number (integer N), convert it into binary and print. */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
	
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        System.out.println(Integer.toBinaryString(n));
        
    }
}
