/*Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
 */


 import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++)
        {
            int pr = num;
            for(int j=1;j<=n;j++)
            {
                System.out.print(pr);
                pr+=2;
                if(i+j==n+1)
                {
                    pr=1;
                }
            }
            num+=2;
            System.out.println();
        }
	}
}