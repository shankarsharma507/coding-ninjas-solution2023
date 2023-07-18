/*Write a program to print multiplication table of n
Input Format :
A single integer, n
Output Format :
First 10 multiples of n each printed in new line
 */

 import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		 
Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        
     int i = 1;
        while (i <= 10) {
            System.out.println(n * i);
            i++;
		}

	
}
}