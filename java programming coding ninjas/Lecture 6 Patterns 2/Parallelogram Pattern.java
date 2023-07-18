/* Write a program to print parallelogram pattern for the given N number of rows.
 
 */


 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= N; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
