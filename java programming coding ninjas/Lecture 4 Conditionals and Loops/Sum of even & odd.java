/*Write a program to input an integer 'n' and print the sum of all its even digits and sum of all its odd digits separately.


Digits mean numbers, not the places! That is, if the given integer is "132456", even digits are 2, 4 and 6 and odd digits are 1, 3 and 5.
 */


 import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int digit;
		int ev=0,odd=0;
		while(num>0)
		{
			digit=num%10;
			num=num/10;
			if(digit%2!=0)
				odd=odd+digit;
			else
				ev=ev+digit;
		}
		System.out.print(ev+" "+odd);
        }

	}

