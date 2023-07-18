/*You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one. */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int pre=scan.nextInt();
		int i=1;
		boolean isDec=true;
		int count=0;
		while(i<=n-1) {
			int curr=scan.nextInt();
			if(pre==curr) {
				System.out.println(false);
				return ;
			}
			else if(pre<curr) {
				if(isDec) {
					count++;
					isDec=false;
				}
				
			}else {
				if(!isDec) {
					System.out.println(false);
					return ;
				}
				
				
			}
			i++;
			pre=curr;
		}
		if(count==1&&isDec==false || count==0 && isDec==true || count==0 && isDec==false) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
