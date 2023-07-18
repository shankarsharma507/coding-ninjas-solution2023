/*There is an array ‘A’ of size ‘N’.
You are also given an integer ‘X’ and direction ‘DIR’. You must rotate the array in the direction of ‘DIR’ by ‘X’ positions.
You must return the rotated array. */


public class Solution {
    public static int[] rotateArray(int []a, int x, String dir) {
        // Write your code here.
       int n = a.length;
        int[] rotatedArray = new int[n];
        
        if (dir.equals("LEFT")) {
            x = x % n; // Adjust x to handle cases where x > n
            for (int i = 0; i < n; i++) {
                rotatedArray[i] = a[(i + x) % n];
            }
        } else if (dir.equals("RIGHT")) {
            x = x % n; // Adjust x to handle cases where x > n
            for (int i = 0; i < n; i++) {
                rotatedArray[i] = a[(i + n - x) % n];
            }
        }
        
        return rotatedArray;

    }

}