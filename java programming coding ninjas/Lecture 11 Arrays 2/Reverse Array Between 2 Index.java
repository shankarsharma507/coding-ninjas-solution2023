/*Given an array ‘ARR’ of size ‘N’. You are also given two indices ‘L’ and ‘R’.
Your task is to reverse the ‘ARR’ from index ‘L’ to ‘R’ inclusive. */



public class Solution {
    public static int[] reverseBetween(int n, int l, int r, int []arr) {
        // Write your code from here.

         if (l < 0 || r >= n || l > r) {
            return arr;
        }
        
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        
        return arr;
    }

}  