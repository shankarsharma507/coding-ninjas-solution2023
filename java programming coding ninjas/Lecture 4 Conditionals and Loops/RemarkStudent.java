/*Teacher is remarking students on the basis of their score. Criteria for remarking students are as follows:
If the score is greater than 75 to 100 then it will be remarked ‘Distinction’.
If the score is greater than 50 to 75 then it will remarked ‘Average’
If the score is between 35 - 50 then it will be remarked ‘Below Average’.
 */

 public class Solution {
    public static void remarkStudent(int score) {
        // Write your code here
        
        
        if(score > 75 && score <= 100){
            System.out.println("Distinction");
        }
        else if (score > 50 && score <= 75){
            System.out.println("Average");
        }
        else if(score >= 35 && score <= 50){
            
        
            System.out.println("Below Average");
        }
    }
}