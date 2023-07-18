/*Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list. */



public class Solution {
	
	public static int sum(int[] arr) {
		//Your code goes here
		     
        int sum=0;        
   
        for(int j=0;j<arr.length;j++)
        {
        	sum=sum+arr[j];    
        }
        return sum;
			
		
	}
}