/*
 Given a binary array nums and an integer k, return the maximum number of 
 consecutive 1's in the array if you can flip at most k 0's.
 */
public class MaxConsect {
    
    public int longestOnes(int[] nums, int k) {
        int n = nums.length; // Get the length of the input array
        int i = 0, j = 0; // Initialize two pointers i and j
        int maxi = Integer.MIN_VALUE; // Initialize the maximum length to the minimum integer value
        while(j < n){ // Iterate through the array using pointer j
            if(nums[j] == 0){ // If the element at j is 0, decrement k
                k--;
            }
            while(k < 0){ // While k is less than 0 (more zeroes than allowed)
                if(nums[i] == 0){ // If the element at i is 0, increment k
                    k++;
                }
                i++; // Move pointer i to the right
            }
            maxi = Math.max(maxi, j - i + 1); // Update the maximum length with the current window size
            j++; // Move pointer j to the right
        }
        return maxi; // Return the length of the longest subarray with at most k zeroes
    }
}
