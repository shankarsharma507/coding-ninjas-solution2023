// You are given a matrix ‘MAT’. Print the transpose of the matrix. The transpose of a matrix is obtained by changing rows to columns and columns to rows. In other words, transpose of a matrix A[][] is obtained by changing A[i][j] to A[j][i].

import java.util.* ;
import java.io.*; 
 
public class Solution {

	public static int[][] transpose(int m, int n, int[][] mat) {
		// Write your code here
		 int[][] transposed = new int[n][m]; // Create a new matrix to store the transpose
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = mat[i][j]; // Assign the value at [i][j] to [j][i] in the transposed matrix
            }
        }
        
        return transposed; // Return the transposed matrix
		
	}

}
