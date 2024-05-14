/*
You have a long flowerbed in which some of the plots are planted, 
and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, 
where 0 means empty and 1 means not empty, and an integer n, 
return true if n new flowers can be planted in the flowerbed 
without violating the no-adjacent-flowers rule and false otherwise.

 */
public class Flowers {
    
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // If no flowers need to be planted, return true
        if(n == 0)
            return true;
    
        // Iterate through the flowerbed array with a step of 2
        for (int i = 0; i < flowerbed.length; i = i + 2) {
            // Check if the next plot is occupied
            if (i + 1 < flowerbed.length && flowerbed[i + 1] == 1)
                // Skip the next plot if it is occupied
                i++;
            // Check if the current plot is empty
            else if (flowerbed[i] == 0) {
                // Place a flower in the current plot
                n--;
                // If all required flowers are planted, return true
                if (n <= 0)
                    return true;
            }
        }
    
        // Return false if not all flowers could be planted
        return false;
    }
    
}
