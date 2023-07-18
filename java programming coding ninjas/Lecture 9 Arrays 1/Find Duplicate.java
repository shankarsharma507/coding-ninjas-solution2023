/*You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array. */



public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        
        int xor = 0;
        
        // Perform XOR of all elements in the array/list
        for (int num : arr) {
            xor ^= num;
        }
        
        // Perform XOR of all numbers from 0 to (N - 2)
        for (int i = 0; i < arr.length - 1; i++) {
            xor ^= i;
        }
        
        return xor;
            
        
        
    }
}