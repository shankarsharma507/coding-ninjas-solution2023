/*Print the following pattern for the given number of rows. */


    import java.util.Scanner;

    public class Solution {

        public static void main(String[] args) {
            /* Your class should be named Solution.
            * Read input as specified in the question.
            * Print output as specified in the question.
            */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        
        
            int row = 1;
            while (row <= n) {
                int count = 1;

                // Print spaces
                while (count <= n - row) {
                    System.out.print(" ");
                    count++;
                }

                int num = row;
                count = 1;

                // Print numbers in increasing order
                while (count <= row) {
                    System.out.print(num);
                    num++;
                    count++;
                }

                num = num - 2;
                count = 1;

                // Print numbers in decreasing order
                while (count < row) {
                    System.out.print(num);
                    num--;
                    count++;
                }

                System.out.println();
                row++;
            }
        }
    }








