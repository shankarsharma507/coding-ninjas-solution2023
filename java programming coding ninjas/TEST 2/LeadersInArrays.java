// Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
// Print all the leader elements separated by space and in the same order they are present in the input array.




public class Solution {

	public static void leaders(int[] input) {
	
		for(int i=0;i<input.length;i++) {
			boolean allSmall=true;
			for(int j=i+1;j<input.length;j++) {
				if(input[i] < input[j]) {
					allSmall=false;
					break;
				}
			}
			if(allSmall) {
				System.out.print(input[i]+" ");
			}
		}
		
	}
	
}