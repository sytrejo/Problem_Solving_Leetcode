/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string 
by deleting some (can be none) of the characters without disturbing the relative
positions of the remaining characters. 
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */

class Subsequence {
    public boolean isSubsequence(String s, String t) {
        // Initialize an index to track the position in string s
        int si = 0;
    
        // If the string s is empty, it is considered a subsequence of any string
        if (s.length() < 1)
            return true;
    
        // Iterate over each character in string t
        for (int i = 0; i < t.length(); i++) {
            // If the current character in t matches the current character in s
            if (s.charAt(si) == t.charAt(i))
                // Move to the next character in s
                si++;
    
            // If we have matched all characters in s, return true
            if (si == s.length())
                return true;
        }
    
        // If we finish the loop without matching all characters in s, return false
        return false;
    }
    
 }