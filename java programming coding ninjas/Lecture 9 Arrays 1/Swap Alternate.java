/*You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
You don't need to print or return anything, just change in the input array itself. */



public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
         int temp=0,n=arr.length;
        for(int i=0;i<n-1;i+=2){
         temp=arr[i];
         arr[i]=arr[i+1];
         arr[i+1]=temp;
         }
    }
}