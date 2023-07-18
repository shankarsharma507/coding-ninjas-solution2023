/*Write a program to print first x terms of the series 3N + 2 which are not multiples of 4. */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        for(int i = 1; i <= n; i++){
            result = 3*i+2;
            if(result % 4 != 0){
            System.out.print(result+" ");
            }
            else{
                 n++;
            }
            

        }
      
    }
}

