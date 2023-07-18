/*Print the following pattern for the given N number of rows.
Pattern for N = 3
A
A B
A B C
Input Format:
Integer N (Total no. of rows)
Output Format:
Pattern in N lines
 */


 public class Solution {
    public static void gameOfAlphabet(int n) {
        // Write your code here

        int i = 0;

        while (i < n) {
            char ch = 'A';
            int j = 0;

            while (j <= i) {
                System.out.print(ch + " ");
                ch++;
                j++;
            }
            System.out.println();
            i++;
    }
}
}