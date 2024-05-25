/*
 Given an integer array nums, move all 0's to the end of it while maintaining 
 the relative order of the non-zero elements.
 Note that you must do this in-place without making a copy of the array.
 */

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        // Get the length of the array
        int n = nums.length;
        // Initialize j to -1, which will be used to track the position to place non-zero elements
        int j = -1;
        // Initialize i to 0, which will be used to iterate through the array
        int i = 0;
    
        // Loop through the entire array
        while (i < n) {
            // If the current element is not zero
            if (nums[i] != 0) {
                // Increment j to point to the next position to place a non-zero element
                j++;
                // Swap the elements at positions j and i
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            // Move to the next element
            i++;
        }
    }
    
    

}
