/*You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted. */



public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        
    int n = arr1.length;
    int m = arr2.length;
    int[] mergedArray = new int[n + m];

    int ptr1 = 0;
    int ptr2 = 0;
    int index = 0;

    while (ptr1 < n && ptr2 < m) {
        if (arr1[ptr1] < arr2[ptr2]) {
            mergedArray[index] = arr1[ptr1];
            ptr1++;
        } else {
            mergedArray[index] = arr2[ptr2];
            ptr2++;
        }
        index++;
    }

    while (ptr1 < n) {
        mergedArray[index] = arr1[ptr1];
        ptr1++;
        index++;
    }

    while (ptr2 < m) {
        mergedArray[index] = arr2[ptr2];
        ptr2++;
        index++;
    }

    return mergedArray;
}
}

    

