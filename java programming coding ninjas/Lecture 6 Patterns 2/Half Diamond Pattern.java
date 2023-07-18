/*Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.
 */


 import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        scan.close();

        int row=1,col=3;
		System.out.println('*');
		while(row<=2*N-1)
		{
			int i=1,num=1;
			while(i<=col)
			{
                if(i==1 || i==col)
                    System.out.print('*');
                else
                {
			    	System.out.print(num);
				    if(i<=col/2)
					    num++;
				    else	
					    num--;
                }
				i++;
			}
			if(row<N)
				col+=2;
			else
				col-=2;
			row++;
			System.out.println();
		}
		System.out.println('*');
    }
}

