// You are given a 2D array of integers ‘A’ of length ’N’x’M’, where ‘N’ is the number of rows and ‘M’ is the number of columns. Check if the given array forms a square matrix and returns its diagonal elements.
// A Square matrix is one that has an equal number of rows and columns.


import java.util.*;
public class Solution {
    public static String sqrMat(int [][]mat, int n, int m,int diag[]) 
{
        // Write your code here.
       
        String answer = "";
        if (n != m) {
            answer = "NO";

        }
        else {
            answer = "YES";
            for(int i=0;i<n;i++){
                diag[i] = mat[i][i];
            }
        }
        return answer;
    }
}
