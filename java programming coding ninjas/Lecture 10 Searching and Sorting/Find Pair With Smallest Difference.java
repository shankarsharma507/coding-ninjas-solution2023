/*IGiven two unsorted arrays of non-negative integers, 'arr1' and 'arr2' of size 'N' and 'M', respectively. Your task is to find the pair of elements (one from each array), such that their absolute (non-negative) difference is the smallest, and return the difference. */


public class Solution {
    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        // Write your code here.
          // Sort the arrays in ascending order
        // Sort arr1 using insertion sort
       for (int i = 1; i < n; i++) {
            int key = arr1[i];
            int j = i - 1;

            while (j >= 0 && arr1[j] > key) {
                arr1[j + 1] = arr1[j];
                j--;
            }

            arr1[j + 1] = key;
        }

        // Sort arr2 using insertion sort
        for (int i = 1; i < m; i++) {
            int key = arr2[i];
            int j = i - 1;

            while (j >= 0 && arr2[j] > key) {
                arr2[j + 1] = arr2[j];
                j--;
            }

            arr2[j + 1] = key;
        }

        int i = 0;
        int j = 0;
        int minDiff = Integer.MAX_VALUE;

        while (i < n && j < m) {
            int diff = Math.abs(arr1[i] - arr2[j]);
             minDiff = Math.min(minDiff, diff);

         

            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return minDiff;
    }
}