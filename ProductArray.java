/*
 * Given an integer array nums, return an array answer such that answer[i] is equal 
 * to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
Using an algorithm that runs in O(n) time and without using the division operation.
 */
class ProductArray {
    public int[] productExceptSelf(int[] arr) {
        // Create two arrays to store the product of all elements to the left and right of each element
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        
        // Initialize the first element of left array to 1
        left[0] = 1;
        
        // Fill the left array where left[i] contains the product of all elements to the left of arr[i]
        for (int i = 1; i < arr.length; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }
        
        // Initialize the last element of right array to 1
        right[arr.length - 1] = 1;
        
        // Fill the right array where right[i] contains the product of all elements to the right of arr[i]
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }
        
        // Update the original array where arr[i] is the product of left[i] and right[i]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = left[i] * right[i];
        }
        
        // Return the modified array
        return arr;
    }
}
