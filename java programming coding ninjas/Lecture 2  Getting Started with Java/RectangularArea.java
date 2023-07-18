/*You are given a rectangle in a plane whose sides are parallel to the axes. The coordinates of one of its diagonals are provided to you. You have to print the total area of the rectangle.
The coordinates of the rectangle are provided as four integral values: x1, y1, x2, y2. It is given that x1 < x2 and y1 < y2.
 */

 import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
		Scanner sc = new Scanner(System.in);
     
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int result = ((x2 - x1) * (y2 - y1));
		System.out.println(result);

	}

}