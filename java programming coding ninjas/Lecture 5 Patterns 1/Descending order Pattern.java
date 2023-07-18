/*Print the following pattern for the given N number of rows.
Pattern for N = 5
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
 */


    

public class Solution {
    public static void trianglePattern(int n) {
        // Write your code here
        
       if (n > 0) {
            int i = 0;
            while (i < n) {
                int j = n;
                int count = 0;

                while (count <= i) {
                    System.out.print(j + " ");
                    j--;
                    count++;
                }

                System.out.println();
                i++;
            }
        }
    }
}
