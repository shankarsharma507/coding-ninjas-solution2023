/*Write a program that takes a number as input and prints all its factors. If the number has only two factors (1 and the number itself), then the program should print -1.
Input Format :
A single integer, n
Output Format :
All the factors of n excluding 1 and the number itself
 */


 import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        
        boolean hasFactors = false;

        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                System.out.print(i + " ");
                hasFactors = true;
            }
            i++;
        }

        if (!hasFactors) {
            System.out.println("-1");
        }
     
        
    }
}