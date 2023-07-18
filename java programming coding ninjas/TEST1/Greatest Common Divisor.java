/*You are given two numbers, ‘X’ and ‘Y’. Your task is to find the greatest common divisor of the given two numbers.
The Greatest Common Divisor of any two integers is the largest number that divides both integers. */


import java.util.* ;
import java.io.*; 

public class Solution {
	public static int findGcd(int x, int y) {
		// Write your code here
		 
        if (y == 0) {
            return x;
        } else {
            return findGcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            int gcd = findGcd(X, Y);
            System.out.println(gcd);
        }
    }
}
		
		
