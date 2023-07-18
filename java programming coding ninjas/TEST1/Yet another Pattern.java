/*Ninja was playing with her sister to solve a puzzle pattern. However, even after taking several hours, they could not solve the problem.
A value of N is given to them, and they are asked to solve the problem. Since they are stuck for a while, they ask you to solve the problem. Can you help solve this problem? */

import java.util.* ;
import java.io.*; 
public class Solution {

	public static void ninjaPuzzle(int n) {

		// Write your code here.
			int i, j;
  

        for (i = n; i > 0; i--) {
           
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            

            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
  
            System.out.println();
        }
	}
}