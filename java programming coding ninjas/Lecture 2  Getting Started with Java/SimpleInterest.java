/*Simple Interest

Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.
Note: Print the answer as Floor integer value.
Input Format:
The first line of input contains a single integer Principal amount. 

The Second line of input contains a single decimal Rate of interest.

The Third line of input contains a single Integer Time period.
Output Format:
Calculate the Simple Interest and print it. */

public class Solution {
    public static double calculateSimpleInterest(int p, int r, int t) {
     

     // long p;
        // long r;
       //  long t;

        long SI = (p*r*t);
        double SimpleInterest =(double) SI/100;

        return SimpleInterest;
    }

}