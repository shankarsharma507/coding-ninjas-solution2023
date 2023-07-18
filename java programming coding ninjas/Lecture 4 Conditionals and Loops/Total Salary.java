/*Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.
 */


 import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan=new Scanner(System.in);
		int basic=scan.nextInt();
		char grade=scan.next().charAt(0);
		scan.close();

		double hra=0.2*basic;
		double da=0.5*basic;
		double pf=0.11*basic;
		int allow=0;
		if(grade=='A')
			allow=1700;
		else if(grade=='B')
			allow=1500;
		else
			allow=1300;

		double totalSalary=basic+hra+da+allow-pf;
		System.out.println(Math.round(totalSalary));
	

	}
}
