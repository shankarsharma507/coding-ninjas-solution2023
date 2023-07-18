/*Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1
 */


 import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
       Scanner scanner = new Scanner(System.in);
      
          Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int i=0,temp=1;
        while(i<n){
            temp=temp*x;
            i++;
        }
        System.out.print(temp);


        
    }
        
    
}