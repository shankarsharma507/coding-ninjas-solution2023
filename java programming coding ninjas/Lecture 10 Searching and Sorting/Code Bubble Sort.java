/*You are given an integer array 'arr' of size 'N'.


You must sort this array using 'Bubble Sort'. */


public class Solution {
    public static void bubbleSort(int[] arr, int size){
        //Your code goes here
            for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    

}