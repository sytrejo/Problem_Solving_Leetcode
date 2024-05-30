/*
 You are given an integer array nums consisting of n elements, 
 and an integer k. Find a contiguous subarray whose length is 
 equal to k that has the maximum average value and return this 
 value. Any answer with a calculation error less than 10-5 will 
 be accepted.
 */
public class MaxAvgSub {

    public double findMaxAverage(int[] nums, int k) {
        // Initialize the sum of the first 'k' elements
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        // Initialize the result with the sum of the first 'k' elements
        double res = sum;
        
        // Slide the window of size 'k' across the array
        for (int i = k; i < nums.length; i++) {
            // Update the sum by adding the next element and subtracting the element that is left behind
            sum += nums[i] - nums[i - k];
            
            // Update the result if the current sum is greater than the previous maximum sum
            res = Math.max(res, sum);
        }
        
        // Return the maximum average by dividing the maximum sum by 'k'
        return res / k;
    }
    
    
}
