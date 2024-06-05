/*
 Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 
1's in the resulting array.
Return 0 if there is no such subarray.
 */

public class LongestSubArray {

    public int longestSubarray(int[] nums) {
        int back = 0; // Initialize a variable to track the count of zeros before the current sequence of ones.
        int count = 0; // Initialize a variable to count the consecutive ones in the current sequence.
        int max = 0; // Initialize a variable to store the length of the longest subarray of consecutive ones.

        for (int i : nums) {
            if (i == 1) {
                count++; // Increment the count if the current element is 1.
            } else {
                max = Math.max(max, back + count); // Update the maximum length of consecutive ones encountered.
                back = count; // Update the count of zeros before the current sequence.
                count = 0; // Reset the count for the next sequence of ones.
            }
        }

        max = Math.max(max, back + count); // Update the maximum length after processing all elements.

        if (max == nums.length) {
            return nums.length - 1; // If the maximum length is equal to the array length, return length - 1.
        }
        
        return max; // Return the length of the longest subarray of consecutive ones.
    }

    
}

/*
 * Simpler version of the code
 * 
 * public int longestSubarray(int[] nums) {
    int maxCount = 0; // Initialize a variable to store the maximum count of consecutive ones.
    int currentCount = 0; // Initialize a variable to store the current count of consecutive ones.

    for (int num : nums) {
        if (num == 1) {
            currentCount++; // Increment the current count if the element is 1.
        } else {
            maxCount = Math.max(maxCount, currentCount); // Update the maximum count.
            currentCount = 0; // Reset the current count when encountering a zero.
        }
    }

    // Update the maximum count after processing all elements.
    maxCount = Math.max(maxCount, currentCount);

    return maxCount;
}

 */