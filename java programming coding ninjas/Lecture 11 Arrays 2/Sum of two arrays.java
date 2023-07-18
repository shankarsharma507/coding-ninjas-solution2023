/*Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index. */



public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
          int sum=0,carry=0,result=0;
        int i=arr1.length-1,j=arr2.length-1,l=output.length-1;
        while(i>-1&&j>-1)
        {   
            sum=carry+arr1[i]+arr2[j];
            result=sum%10;
            output[l]=result;
            carry=sum/10;
            i--;
            j--;
            l--;
        }
        if(carry>0){
        output[l]=carry;
        l--;
        }
        while(i>-1)
        {
            sum=carry+arr1[i];
            result=sum%10;
            output[l]=result;
            carry=sum/10;
            i--;
            l--;
        }
         while(j>-1)
        {
            sum=carry+arr2[j];
            result=sum%10;
            output[l]=result;
            carry=sum/10;
             j--;
             l--;
        }
    }
}