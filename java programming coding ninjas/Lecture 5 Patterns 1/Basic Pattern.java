/*Print the following pattern for the given N number of rows.
Pattern for N = 3
###
###
###
Input Format:
Integer N (Total no. of rows)
 */

 public class Solution {
    public static void gameOfPattern(int n) {
        // Write your code here

        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= n){
                 System.out.print('#');
                 j =  j + 1;

            }
        
           
            System.out.println();
             i = i + 1;
        }

    
        
        
    }
}
