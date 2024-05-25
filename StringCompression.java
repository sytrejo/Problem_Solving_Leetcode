/*
Given an array of characters chars, compress it using the following algorithm:
Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in 
the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.
 */

 class StringCompression {
    public int compress(char[] chars) {
        // Initialize the index for the position in the compressed array
        int index = 0;
        // Initialize the index for iterating through the input array
        int i = 0;

        // Loop through the entire array
        while (i < chars.length) {
            // Start another index j from the current position i
            int j = i;
            
            // Move j forward as long as the characters are the same
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }

            // Store the current character at the current index position
            chars[index++] = chars[i];
            
            // If there's more than one occurrence of the character
            if (j - i > 1) {
                // Convert the count of occurrences to a string
                String count = j - i + "";
                // Store each character of the count string in the array
                for (char c : count.toCharArray()) {
                    chars[index++] = c;
                }
            }

            // Move i to the next new character
            i = j;
        }

        // Return the length of the compressed array
        return index;
    }
}

/*
 * Time complexity: O(n) where n is the length of the input array
 * 
 * However, this is another potential solution. 
 * 
 * class StringCompression {
    public int compress(char[] chars) {
        // Initialize the index for the position in the compressed array
        int index = 0;
        // Initialize the index for iterating through the input array
        int i = 0;

        // Loop through the entire array
        while (i < chars.length) {
            // Start j from the current position i
            int j = i;
            
            // Move j forward as long as the characters are the same
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }

            // Store the current character at the current index position
            chars[index++] = chars[i];
            
            // Calculate the count of the current character
            int count = j - i;
            
            // If the count is greater than 1, convert it to a string and store each digit
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }

            // Move i to the next new character
            i = j;
        }

        // Return the length of the compressed array
        return index;
    }
}

 */