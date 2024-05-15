/*
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. 
The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. 
Do not include any extra spaces.
 */

public class ReverseWords {

    public String reverseWords(String s) {
        // Split the string by one or more whitespace characters
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        /*
        The for loop for (int i = words.length - 1; i >= 0; i--) is used to iterate 
        through the words array in reverse order, starting from the last element 
        and moving towards the first element. The words.length - 1 is the index of 
        the last element
        in the array because array indices are zero-based (i.e., they start from 0).
         */
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }


}
