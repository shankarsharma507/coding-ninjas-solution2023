/*Write a program to print triangle of user defined integers sum.
Input Format :
A single integer, N
Output Format :
Required Pattern

*/


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
Scanner inp=new Scanner(System.in);
        int p=inp.nextInt();

        for (int i=1;i<=p;i++) {
            int n=2;
            System.out.print(1);
            for (int k=1;k<i;k++){
                System.out.print("+"+n);
                n++;
            }

            int sum = (i * i + i) / 2;
            System.out.println("="+sum);
        }
	}
}