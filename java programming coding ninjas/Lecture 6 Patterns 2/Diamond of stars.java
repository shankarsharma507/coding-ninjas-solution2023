/*Print the following pattern for the given number of rows.
Note: N is always odd.
 */


 import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();

        int row = 1;
        int mid = (N + 1) / 2; // Midpoint of the pattern

        while (row <= N) {
            int spaces = Math.abs(mid - row);
            int stars = N - 2 * spaces;

            int count = 1;

            // Print spaces
            while (count <= spaces) {
                System.out.print(" ");
                count++;
            }

            count = 1;

            // Print stars
            while (count <= stars) {
                System.out.print("*");
                count++;
            }

            System.out.println();
            row++;
        }
    }
}
