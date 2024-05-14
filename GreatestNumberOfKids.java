/* 
There are n kids with candies. You are given an integer array candies, 
where each candies[i] represents the number of candies the ith kid has,
and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies, they will have the greatest
number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
*/

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfKids {

        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int maxCandies = 0; // maximum candies is initialised as 0
        
        // loop is initiated to traverse the loop to get the highest element
        for (int candy : candies) {
            // finding out the largest element among the given array list
            maxCandies = Math.max(candy, maxCandies);

        }
        
        // creating an empty list for the output
        List<Boolean>result = new ArrayList<>(); 
        for (int candy : candies) {
             // true/false value is appended to the list according to the condidtion
            result.add(candy + extraCandies >= maxCandies); 
        }
        return result; 
    }
    
}
