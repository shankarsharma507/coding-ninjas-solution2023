/*Sort the given unsorted array 'arr' of size 'N' in non-decreasing order using the selection sort algorithm.
 */


 public class Solution {  

    public static void selectionSort(int[] arr, int n) {
    	//Your code goes here
          for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the minimum element with the first element in the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
          }
    }   

}