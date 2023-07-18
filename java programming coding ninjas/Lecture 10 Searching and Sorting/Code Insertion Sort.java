/*You are given an integer array 'arr' of size 'N'.


You must sort this array using 'Insertion Sort' recursively. */


public class Solution {  

    public static void insertionSort(int[] arr, int n) {
    	//Your code goes here
         for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;
        }
    
    }

}