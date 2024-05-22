public class TripleIndex {
        public boolean increasingTriplet(int[] nums) {
            
            // Initialize two variables to store the smallest and middle values found so far
            int small = Integer.MAX_VALUE;
            int mid = Integer.MAX_VALUE;
    
            // Iterate through each number in the array
            for (int big : nums) {
                // If the current number is less than or equal to 'small', update 'small'
                if (big <= small) {
                    small = big;
                }
                // Otherwise, if the current number is less than or equal to 'mid', update 'mid'
                else if (big <= mid) {
                    mid = big;
                }
                // If the current number is greater than both 'small' and 'mid', we have found the triplet
                else {
                    return true;
                }
            }
            // If no such triplet is found, return false
            return false;
        }
    
    
    
}
