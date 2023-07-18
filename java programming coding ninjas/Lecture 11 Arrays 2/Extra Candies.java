/*There are ‘N’ houses. Two persons ‘P1’ and ‘P2’ distribute some candies to all these houses.
You are given an integer, ‘X’. If the total number of candies received by any house is more than ‘X’, it will pass the rest of the candies to the next house to the right. The rightmost house will just throw the extra candies.
You must return an array of ‘N’ integers denoting the final number of candies for all the houses. */


import java.util.*;
public class Solution {
    public static int[] extraCandies(int n, int x, int []p1, int []p2) {
        // Write your code here.
         int[] result = new int[n];
        int extra = 0;

        for (int i = 0; i < n; i++) {
            result[i] = p1[i] + p2[i] + extra;
            if (result[i] > x) {
                extra = result[i] - x;
                result[i] = x;
            } else {
                extra = 0;
            }
        }

        return result;
    }
}