/*Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401. */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        if(n==0)
        {
            System.out.print(n);
        }
        for(int j=n;j>=1;j--)
        {
         
            if(n%10==0)
            {
				n=n/10;
                continue;
            }
            else 
            {
                break;
            }
		
        }
        int num=n;
        for(int i=num;i>=1;i--)
             {
                temp=num%10;
                System.out.print(temp);
                num=num/10;
                temp=0;
            if(num==0)
            {
                break;
            }
    	}    	
        
	}
}

