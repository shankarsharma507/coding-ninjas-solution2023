/*You are given an integer array 'A' of size 'N', sorted in ascending order. You are also given an integer 'target'.


Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing. Otherwise, return -1.


Note: You must write an algorithm whose time complexity is O(logN). */

public class Solution {
    public static int search(int []nums, int target) {
        //Your code goes here
          int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;  // Found the target, return its index
            } else if (nums[mid] < target) {
                left = mid + 1;  // Target is in the right half
            } else {
                right = mid - 1;  // Target is in the left half
            }
        }
        
        return -1;  // Target not found
    }
    

}