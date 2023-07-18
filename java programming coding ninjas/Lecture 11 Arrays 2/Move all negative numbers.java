/*You are given an array 'ARR' consisting of 'N' integers. You need to rearrange the array elements such that all negative numbers appear before all positive numbers. */


public class Solution {
    public static int[] separateNegativeAndPositive(int a[]) {
   //NA is used to point to -ve valued indices.
        int NA=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                int temp=a[i];
                a[i]=a[NA];
                a[NA]=temp;
                NA++;
            }
            
        }
          return a; 
    }
}
