/*You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once. */



public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
arr[mid] = arr[low];
arr[low] = temp;

                low++;
                mid++;

            }
            else if(arr[mid]==1){
               
                mid++;

        }
          else if(arr[mid]==2){
         int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
          }
        }
    }

}