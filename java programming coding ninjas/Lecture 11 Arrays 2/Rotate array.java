/*You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left). */



public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n=arr.length;
        int temp[]=new int[n];   
        int k=0,m=0;
        for(int i=d;i<arr.length;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int j=0;j<d;j++){
            temp[k]=arr[j];
            k++;
        }
        for(int l=0;l<temp.length;l++)
        {
            arr[m]=temp[l];
            m++;
        }
        
    }

}
    