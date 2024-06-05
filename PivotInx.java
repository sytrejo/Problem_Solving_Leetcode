/*
 * Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the 
left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because 
there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
 */


public class PivotInx {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0) return -1;
        
        int n = nums.length;
        int totalsum = 0, leftsum = 0;
        
        for(int i : nums)
            totalsum += i;
        
        for(int i = 0; i < n; i++) {
            if(leftsum == (totalsum - nums[i]))
                return i;
            else {
                leftsum += nums[i];
                totalsum -= nums[i];
                
            }
        }
        
        return -1;
    }
}
