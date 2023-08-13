// For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.


public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
		int sum=0;
		// for sum of top row and bottom row

		for(int i=0; i< mat.length; i++){
			sum+=mat[0][i];
			sum+=mat[mat.length-1][i];
		}
		// for sum of left and right cols


		for (int i = 1; i < mat.length - 1; i++) {
            sum += mat[i][0];
            sum += mat[i][mat.length - 1];
        }	
		//for left and right diagonal sum

		for(int i=1; i<mat.length-1; i++){
			sum+=mat[i][i];
			sum+=mat[i][mat.length-1-i];
		}
		//if number of row/column is odd 
		if(mat.length%2 !=0){
			sum-=mat[mat.length/2][mat.length/2];
		}
		System.out.println(sum);
	}

}