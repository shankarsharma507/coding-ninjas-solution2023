// For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.



public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
		 int Lrow=Integer.MIN_VALUE;
        int Lcol=Integer.MIN_VALUE;
        int C_index=0;
        int R_index=0;
	
		boolean isRow=true;
		

		
		  if (mat.length>0){
		for(int i=0; i<mat.length; i++){
			int sum=0;
					for(int j=0; j<mat[0].length; j++){
						sum+=mat[i][j];


					}
					if(Lrow<sum){
						Lrow=sum;
						isRow=true;
						R_index=i;
					}

		}
		  }
		for(int j=0; j<mat[0].length; j++){
			int sum=0;
					for(int i=0; i<mat.length; i++){
						sum+=mat[i][j];


					}
					if(Lcol<sum){
						Lcol=sum;
						isRow=false;
						C_index=j;
					}

		}
		//        Now Comparing Both largest
        if (Lrow>Lcol) {
			System.out.println("row "+R_index+" "+Lrow);
		}
        else{
			System.out.println("column "+C_index+" "+Lcol);
		} 
	}

	

}