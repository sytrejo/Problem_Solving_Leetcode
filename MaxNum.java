/*
You are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the 
array whose sum equals k and remove them from the array.
Return the maximum number of operations you can perform 
on the array.
 */

import java.util.Arrays;

public class MaxNum {
    public int maxOperations(int[] nums, int k) {
    // Sort the array to facilitate the two-pointer approach
    Arrays.sort(nums);
    
    // Initialize the count of operations to 0
    int count = 0;
    
    // Initialize two pointers: one at the start (left) and one at the end (right) of the array
    int left = 0;
    int right = nums.length - 1;
    
    // Loop until the two pointers meet
    while (left < right) {
        // If the sum of the elements at the two pointers is less than k, move the left pointer to the right
        if (nums[left] + nums[right] < k) {
            left++;
        // If the sum of the elements at the two pointers is greater than k, move the right pointer to the left
        } else if (nums[left] + nums[right] > k) {
            right--;
        // If the sum of the elements at the two pointers is equal to k
        } else {
            // Move both pointers inward
            left++;
            right--;
            // Increment the count of valid operations
            count++;
        }
    }
    
    // Return the total count of operations where the sum of pairs equals k
    return count;
}

    
}
