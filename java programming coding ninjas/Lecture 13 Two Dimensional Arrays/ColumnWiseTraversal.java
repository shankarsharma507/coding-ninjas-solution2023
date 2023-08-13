// Given a matrix, ‘A’ of size ‘N’ * ‘M’, you must traverse the matrix column-wise.
// You must return an integer array of size ‘N’ * ‘M’ denoting the column-wise traversal of the matrix.

public class Solution {
    public static int[] printColWise(int [][]a) {
        // Write your code here.
          int rows = a.length;
        int columns = a[0].length;
        int[] result = new int[rows * columns];
        int index = 0;

        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                result[index] = a[i][j];
                index++;
            }
        }

        return result;
    }
}