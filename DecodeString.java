/*
 * Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string 
inside the square brackets is being repeated exactly k times. 
Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; 
there are no extra white spaces, square brackets are well-formed, etc. 
Furthermore, you may assume that the original data does not contain 
any digits and that digits are only for those repeat numbers, k. 
For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will 
never exceed 105.
 */

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int index = 0;
        String result = "";
        while (index < s.length()) {
            char ch = s.charAt(index);
            if (Character.isDigit(ch)) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);
            } else if (ch == '[') {
                stringStack.push(result);
                result = "";
                index++;
            } else if (ch == ']') {
                StringBuilder sb = new StringBuilder(stringStack.pop());
                int count = countStack.pop();
                for (int i = 0; i < count; i++) {
                    sb.append(result);
                }
                result = sb.toString();
                index++;
            } else {
                result += ch;
                index++;
            }
        }
        return result;
    }
}