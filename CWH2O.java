/*
You are given an integer array height of length n. 
There are n vertical lines drawn such that the two 
endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container,
such that the container contains the most water.
Return the maximum amount of water a container can store.

Notice that you may not slant the container.
 */

public class CWH2O {
    public int maxArea(int[] height) {
        // Initialize two pointers, one at the beginning and one at the end of the array
        int left = 0, right = height.length - 1;
        // Variable to store the maximum area found
        int maxArea = 0;
    
        // Loop until the two pointers meet
        while (left < right) {
            // Calculate the height and width of the current container
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            // Calculate the area of the current container
            int curA = h * w;
            // Update maxArea if the current area is larger
            maxArea = Math.max(maxArea, curA);
    
            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
    
        // Return the maximum area found
        return maxArea;
    }
    
    
}
