/*Given a number, print " Multiple of 5" if the number is a multiple of 5, otherwise print "Not a Multiple of 5"
for N = 5
"Multiple of 5" 
Input format :
Integer N (Total no. of rows)
Output format :
"Multiple of 5 " or " Not a Multiple of 5" 
 */

 import java.util.Scanner;

public class Solution {
	public static void multipleOf5(int n) {
        // Write your code here
         if(n % 5 == 0){
            System.out.println("Multiple of 5");
        }
        else{
            System.out.println("Not a Multiple of 5");
        }
		
    }
}