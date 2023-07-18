/*You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list. */

public class Solution {  

    public static int secondLargestElement(int[] arr, int n) {
    	//Your code goes here
        int secondLargest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          if(largest<arr[i])
            {
                secondLargest=largest;
                largest=arr[i];
                
            }
            else if((secondLargest<arr[i])&&arr[i]!=largest)
            {
                secondLargest=arr[i];
               }
            
           
    	}
       return secondLargest;
    }

}